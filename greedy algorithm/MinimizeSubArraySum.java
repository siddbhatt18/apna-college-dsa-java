public class MinimizeSubArraySum {
    public static boolean isPossibleToSplit(int arr[], int k, int maxAllowed) {
        int currSum = 0;
        int parts = 1;
        for(int i = 0; i< arr.length; i++) {
            if(currSum + arr[i] > maxAllowed) {
                currSum = arr[i];
                parts++;
            }
            else {
                currSum = currSum + arr[i];
            }
        }
        if(parts <= k) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int splitArray(int arr[], int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < arr.length; i++) {
            low = Math.max(arr[i], low);
            high = high + arr[i];
        }
        int ans = high;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(isPossibleToSplit(arr, k, mid) == true) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 3;
        System.out.println(splitArray(arr, k));
    }
}