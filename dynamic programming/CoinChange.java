public class CoinChange {
    public static int countWays(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];
        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }
        for(int j = 1; j < sum + 1; j++) {
            dp[0][j] = 0;
        }
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < sum + 1; j++) {
                int currCoin = coins[i - 1];
                if(currCoin <= j) {
                    dp[i][j] = dp[i][j - currCoin] + dp[i - 1][j];
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int sum = 4;
        System.out.println(countWays(coins, sum));
    }
}