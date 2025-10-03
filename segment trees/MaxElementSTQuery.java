public class MaxElementSTQuery {
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
    public static int getMaxUtil(int idx, int si, int sj, int qi, int qj) {
        if(si > qj || sj < qi) {
            return Integer.MIN_VALUE;
        }
        else if(si >= qi && sj <= qj) {
            return tree[idx];
        }
        else {
            int mid = (si + sj) / 2;
            int left = getMaxUtil(2 * idx + 1, si, mid, qi, qj);
            int right = getMaxUtil(2 * idx + 2, mid + 1, sj, qi, qj);
            return Math.max(left, right);
        }
    }
    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        initialize(n);
        buildST(0, 0, n - 1, arr);
        System.out.println(getMax(arr, 2, 5));
    }
}