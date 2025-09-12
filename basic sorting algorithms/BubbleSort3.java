public class BubbleSort3 {
    public static void swapArray(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void bubbleSortOptimized(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    swapArray(arr, j, j + 1);
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSortOptimized(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}