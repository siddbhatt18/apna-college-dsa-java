import java.util.*;
public class MountainArray {
    public static int minimumRemoval(int nums[]) {
        int n = nums.length;
        int lis[] = new int[n];
        int lds[] = new int[n];
        Arrays.fill(lis, -1);
        Arrays.fill(lds, -1);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    int ans1 = lis[i];
                    int ans2 = lis[j] + 1;
                    lis[i] = Math.max(ans1, ans2);
                }
            }
        }
        for(int i = n - 1; i >= 0; i--) {
            for(int j = n - 1; j >= i; j--) {
                if(nums[i] > nums[j]) {
                    int ans1 = lds[i];
                    int ans2 = lds[j] + 1;
                    lds[i] = Math.max(ans1, ans2);
                }
            }
        }
        int maxLength = 0;
        for(int i = 1; i <= n - 2; i++) {
            if(lis[i] > 1 && lds[i] > 1) {
                int currLength = lis[i] + lds[i] - 1;
                maxLength = Math.max(maxLength, currLength);
            }
        }
        return n - maxLength;
    }
    public static void main(String[] args) {
        int nums[] = {2, 1, 1, 5, 6, 2, 3, 1};
        System.out.println(minimumRemoval(nums));
    }
}