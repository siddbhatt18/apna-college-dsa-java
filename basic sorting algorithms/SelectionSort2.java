public class SelectionSort2 {
    public static void swapArray(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void selectionSortReverse(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int maxPos = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[maxPos]) {
                    maxPos = j;
                }
            }
            swapArray(arr, maxPos, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 1, 3};
        selectionSortReverse(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}