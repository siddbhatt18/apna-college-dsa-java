import java.util.*;
public class NumberFrequency {
    public static int mostFrequentNumber(ArrayList<Integer> nums, int key) {
        int idx[] = new int[1000];
        for(int i = 0; i < nums.size() - 1; i++) {
            if(nums.get(i) == key) {
                idx[nums.get(i + 1)]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int result = -1;
        for(int i = 0; i < idx.length; i++) {
            if(idx[i] > max) {
                max = idx[i];
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key = 1;
        System.out.println(mostFrequentNumber(nums, key));
    }
}