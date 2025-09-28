import java.util.*;
public class StackingCuboid {
    public static int maximumHeight(int arr[][]) {
        int n = arr.length;
        for(int cube[] : arr) {
            Arrays.sort(cube);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                if(a[0] != b[0]) {
                    return a[0] - b [0];
                }
                else if(a[1] != b[1]) {
                    return a[1] - b[1];
                }
                else {
                    return a[2] - b[2];
                }
            }
        });
        int ans = 0;
        int dp[] = new int[n];
        for(int i = 0; i < n; i++) {
            dp[i] = arr[i][2];
            for(int j = 0; j < i; j++) {
                if(arr[i][0] >= arr[j][0] && arr[i][1] >= arr[j][1] && arr[i][2] >= arr[j][2]) {
                    dp[i] = Math.max(dp[i], dp[j] + arr[i][2]);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{38, 25, 45}, {76, 35, 3}};
        System.out.println(maximumHeight(arr));
    }
}