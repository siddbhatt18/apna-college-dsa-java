import java.util.*;
public class LonelyNumbers {
    public static ArrayList<Integer> findLonelyNumber(ArrayList<Integer> nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(nums);
        for(int i = 0; i < nums.size(); i++) {
            int val = nums.get(i);
            if((i == 0 || nums.get(i) - nums.get(i - 1) > 1) && (i == nums.size() - 1 || nums.get(i + 1) - nums.get(i) > 1)) {
                list.add(val);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(findLonelyNumber(nums));
    }
}