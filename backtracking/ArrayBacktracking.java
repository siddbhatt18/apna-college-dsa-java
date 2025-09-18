public class ArrayBacktracking {
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void changeArray(int arr[], int idx, int val) {
        if(idx == arr.length) {
            printArray(arr);
            return;
        }
        arr[idx] = val;
        changeArray(arr, idx + 1, val + 1);
        arr[idx] = arr[idx] - 2;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        printArray(arr);
    }
}