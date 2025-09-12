public class MaxSubArraySum2 {
    public static void maxSubArraySum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int k = 1; k < arr.length; k++) {
            prefix[k] = prefix[k - 1] + arr[k];
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(i == 0) {
                    currSum = prefix[j];
                } 
                else {
                    currSum = prefix[j] - prefix[i - 1];
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