public class SegmentTreeBasics {
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
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        initialize(n);
        buildST(arr, 0, 0, n - 1);
        for(int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }   
    }
}