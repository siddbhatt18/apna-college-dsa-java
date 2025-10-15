public class MaxElementSTUpdate {
    static int tree[];
    public static void initialize(int n) {
        tree = new int[n * 4];
    }
    public static void buildST(int idx, int start, int end, int arr[]) {
        if(start == end) {
            tree[idx] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        buildST(2 * idx + 1, start, mid, arr);
        buildST(2 * idx + 2, mid + 1, end, arr);
        tree[idx] = Math.max(tree[2 * idx + 1], tree[2 * idx + 2]);
    }
    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if(idx < si || idx > sj) {
            return;
        }
        if(si == sj) {
            tree[i] = newVal;
            return;
        }
        int mid = (si + sj) / 2;
        updateUtil(2 * i + 1, si, mid, idx, newVal);
        updateUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }
    public static void update(int arr[], int idx, int newVal) {
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n - 1, idx, newVal);
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        initialize(n);
        buildST(0, 0, n - 1, arr);
        update(arr, 2, 20);
        for(int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}