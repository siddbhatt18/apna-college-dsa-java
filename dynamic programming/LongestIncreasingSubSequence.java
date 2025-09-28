import java.util.*;
public class LongestIncreasingSubSequence {
    public static int findLIS(int arr1[]) {
        HashSet<Integer> hs = new HashSet<>();
        int n = arr1.length;
        for(int i = 0; i < n; i++) {
            hs.add(arr1[i]);
        }
        int arr2[] = new int[hs.size()];
        int idx = 0;
        for (int num : hs) {
            arr2[idx] = num;
            idx++;
        }
        Arrays.sort(arr2);
        return findLCS(arr1, arr2);
    }
    public static int findLCS(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                if(arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int arr[] = {50, 3, 10, 7, 40, 80};
        System.out.println(findLIS(arr));
    }
}
