public class MaxSubArraySum1 {
    public static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                int currSum = 0;
                for(int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];
                }
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        maxSubArraySum(arr);
    }
}