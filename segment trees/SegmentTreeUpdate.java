public class SegmentTreeUpdate {
    static int tree[];
    public static void initialize(int n) {
        tree = new int[4 * n];
    }
    public static int buildST(int arr[], int idx, int start, int end) {
        if(start == end) {
            tree[idx] = arr[start];
            return tree[idx];
        }
        int mid = (start + end) / 2;
        buildST(arr, 2 * idx + 1, start, mid);
        buildST(arr, 2 * idx + 2, mid + 1, end);
        tree[idx] = tree[2 * idx + 1] + tree[2 * idx + 2];
        return tree[idx];
    }
    public static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if(idx > sj || idx < si) {
            return;
        }
        tree[i] = tree[i] + diff;
        if(si != sj) {
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, diff);
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff);
        }
    }
    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal;
        updateUtil(0, 0, n - 1, idx, diff);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        initialize(n);
        buildST(arr, 0, 0, n - 1);
        update(arr, 2, 2);
        for(int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}