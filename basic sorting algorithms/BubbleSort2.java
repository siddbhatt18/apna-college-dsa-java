public class BubbleSort2 {
    public static void swapArray(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void bubbleSortReverse(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j + 1]) {
                    swapArray(arr, j, j + 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 1, 3};
        bubbleSortReverse(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}