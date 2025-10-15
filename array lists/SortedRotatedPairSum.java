import java.util.*;
public class SortedRotatedPairSum {
    public static boolean findPairSum(ArrayList<Integer> list, int target) {
        int pivot = -1;
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) > list.get(i + 1)) {
                pivot = i;
            }
        }
        int rightPointer = pivot;
        int leftPointer = (pivot + 1) % list.size();
        while(leftPointer != rightPointer) {
            if(list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            }
            if(list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer = (leftPointer + 1) % list.size();
            }
            else {
                rightPointer = (rightPointer + list.size() - 1) % list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(findPairSum(list, target));
    }
}