public class LongestPalindromicSubSequence {
    public static int findLPS(String str1, String str2) {
        int n = str1.length();
        int dp[][] = new int[n + 1][n + 1];
        for(int k = 0; k < n + 1; k++) {
            dp[k][0] = 0;
            dp[0][k] = 0;
        }
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][n];
    }
    public static void main(String[] args) {
        String str1 = "bbbab";
        String str2 = new StringBuilder(str1).reverse().toString();
        System.out.println(findLPS(str1, str2));
    }
}