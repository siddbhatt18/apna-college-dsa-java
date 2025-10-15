public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(key < arr[mid]) {
                end = mid - 1;
            }
            else if(key > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;
        System.out.println(binarySearch(arr, key));
    }
}