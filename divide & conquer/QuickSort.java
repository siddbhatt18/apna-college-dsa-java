public class QuickSort {
    public static void quickSort(int arr[], int start, int end) {
        if(start >= end) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }
    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for(int j = start; j < end; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8, -2};
        quickSort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}