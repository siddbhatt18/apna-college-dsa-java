import java.util.*;
public class LongestIncreasingPath {
    static int dir[][] = {{0, 1}, {1, 0}};
    public static int dfs(int matrix[][], int i, int j, int dp[][]) {
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int max = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int d = 0; d < dir.length; d++) {
            int x = i + dir[d][0];
            int y = j + dir[d][1];
            if(x >= 0 && y >= 0 && x < m && y < n && matrix[x][y] > matrix[i][j]) {
                max = Math.max(max, dfs(matrix, x, y, dp));
            }
        }
        int pathLength = max + 1;
        dp[i][j] = pathLength;
        return pathLength;
    }
    public static int findPath(int matrix[][]) {
        if(matrix.length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        int longestPath = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int currPath = dfs(matrix, i, j, dp);
                longestPath = Math.max(longestPath, currPath);
            }
        } 
        return longestPath;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {2, 2, 3, 4}, {3, 2, 3, 4}, {4, 5, 6, 7}};
        System.out.println(findPath(matrix));
    }
}