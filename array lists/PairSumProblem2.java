import java.util.*;
public class PairSumProblem2 {
    public static boolean findPairSum(ArrayList<Integer> list, int target) {
        int leftPointer = 0;
        int rightPointer = list.size() - 1;
        while(leftPointer < rightPointer) {
            if(list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            }
            if(list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer++;
            }
            else {
                rightPointer--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(findPairSum(list, target));
    }
}