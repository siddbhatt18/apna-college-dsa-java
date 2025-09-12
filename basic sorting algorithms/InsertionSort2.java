public class InsertionSort2 {
    public static void insertionSortReverse(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int currPos = i;
            int prevPos = i - 1;
            int temp = arr[currPos];
            while(prevPos >= 0 && temp > arr[prevPos]) {
                arr[prevPos + 1] = arr[prevPos];
                prevPos--;
            }
            arr[prevPos + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 1, 3};
        insertionSortReverse(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}