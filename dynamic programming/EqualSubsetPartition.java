public class EqualSubsetPartition {
    public static boolean equalPartition(int nums[]) {
        int n = nums.length;
        int totalSum = 0;
        for(int i = 0; i < n; i++) {
            totalSum = totalSum + nums[i];
        }
        if(totalSum % 2 != 0) {
            return false;
        }
        int target = totalSum / 2;
        boolean dp[][] = new boolean[n + 1][target + 1];
        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }
        for(int j = 0; j < target + 1; j++) {
            dp[0][j] = false;
        }
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < target + 1; j++) {
                int val = nums[i - 1];
                if(val <= j) {
                    boolean ans1 = dp[i - 1][j - val];
                    boolean ans2 = dp[i - 1][j];
                    dp[i][j] = ans1 || ans2;
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args) {
        int nums[] = {1, 5, 11, 5};
        System.out.println(equalPartition(nums));
    }
}