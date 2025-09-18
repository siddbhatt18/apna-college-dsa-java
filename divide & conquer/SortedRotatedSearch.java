public class SortedRotatedSearch {
    public static int sortedRotatedSearch(int arr[], int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[start] <= arr[mid]) {
            if(arr[start] <= target && arr[mid] >= target) {
                return sortedRotatedSearch(arr, target, start, mid - 1);
            }
            else {
                return sortedRotatedSearch(arr, target, mid + 1, end);
            }
        }
        else {
            if(arr[mid] <= target && arr[end] >= target) {
                return sortedRotatedSearch(arr, target, mid + 1, end);
            }
            else {
                return sortedRotatedSearch(arr, target, start, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.print(sortedRotatedSearch(arr, target, 0, arr.length - 1));
    }
}