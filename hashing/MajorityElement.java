import java.util.*;
public class MajorityElement {
    public static int findMajority(int nums[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if(hm.containsKey(curr) == true) {
                hm.put(curr, hm.get(curr) + 1);
            }
            else {
                hm.put(curr, 1);
            }
        }
        Set<Integer> keySet = hm.keySet();
        for(Integer key : keySet) {
            if(hm.get(key) > nums.length / 3) {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        System.out.println(findMajority(nums));
    }
}