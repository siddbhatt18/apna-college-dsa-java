public class MaxElementSTBasics {
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
    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        initialize(n);
        buildST(0, 0, n - 1, arr);
        for(int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}