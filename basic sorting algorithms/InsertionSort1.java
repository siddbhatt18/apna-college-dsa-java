public class InsertionSort1 {
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int currPos = i;
            int prevPos = i - 1;
            int temp = arr[currPos];
            while(prevPos >= 0 && arr[prevPos] > temp) {
                arr[prevPos + 1] = arr[prevPos];
                prevPos--;
            }
            arr[prevPos + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}