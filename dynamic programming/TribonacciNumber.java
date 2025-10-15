public class TribonacciNumber {
    public static void tribonacci(int n) {
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for(int i = 0; i < n; i++) {
            if(i >= 3) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            System.out.print(dp[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = 20;
        tribonacci(n);
    }
}