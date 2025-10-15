public class SelectionSort1 {
    public static void swapArray(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            swapArray(arr, i, minPos);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}