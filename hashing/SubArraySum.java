import java.util.*;
public class SubArraySum {
    public static int findKSumSubArray(int arr[], int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0;
        int ans = 0;
        for(int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            if(hm.containsKey(sum - k)) {
                ans = ans + hm.get(sum - k);
            }
            if(hm.containsKey(sum) == true) {
                hm.put(sum, hm.get(sum) + 1);
            }
            else {
                hm.put(sum, 1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int k = 3;
        System.out.println(findKSumSubArray(arr, k));
    }
}