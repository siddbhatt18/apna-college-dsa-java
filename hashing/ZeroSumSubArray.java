import java.util.*;
public class ZeroSumSubArray {
    public static int findZeroSumSubArray(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int len = 0;
        for(int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            if(hm.containsKey(sum) == true) {
                len = Math.max(len, j - hm.get(sum));
            }
            else {
                hm.put(sum, j);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(findZeroSumSubArray(arr));
    }
}