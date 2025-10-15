public class MinimumPartitioning {
    public static int minPartition(int nums[]) {
        int n = nums.length;
        int totalSum = 0;
        for(int i = 0; i < n; i++) {
            totalSum = totalSum + nums[i];
        }
        int W = totalSum / 2;
        int dp[][] = new int[n + 1][W + 1];
        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        }
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < W + 1; j++) {
                int val = nums[i - 1];
                if(val <= j) {
                    int ans1 = val + dp[i - 1][j - val];
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = totalSum - sum1;
        int diff = Math.abs(sum1 - sum2);
        return diff;
    }
    public static void main(String[] args) {
        int nums[] = {1, 6, 11, 5};
        System.out.println(minPartition(nums));
    }
}