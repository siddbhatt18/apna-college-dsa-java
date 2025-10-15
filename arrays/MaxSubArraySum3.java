public class MaxSubArraySum3 {
    public static void maxSubArraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        maxSubArraySum(arr);
    }
}