import java.util.*;
public class TwoSum {
    public static int[] solveTwoSum(int nums[], int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int result[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(hm.containsKey(diff) == true) {
                result[0] = hm.get(diff);
                result[1] = i;
                break;
            } 
            else {
                hm.put(nums[i], i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = solveTwoSum(nums, target);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}