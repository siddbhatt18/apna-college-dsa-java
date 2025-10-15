public class SortedRotatedSearch {
    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } 
            else if(arr[start] <= arr[mid]) {
                if(arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } 
                else {
                    start = mid + 1;
                }
            } 
            else {
                if(arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } 
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {6, 7, 0, 1, 2, 3, 4, 5};
        int target = 2;
        System.out.println(binarySearch(arr, target));
    }
}