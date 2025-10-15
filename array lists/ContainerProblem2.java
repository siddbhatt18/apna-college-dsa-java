import java.util.*;
public class ContainerProblem2 {
    public static int findMaxWaterCollected(ArrayList<Integer> list) {
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = list.size() - 1;
        while(leftPointer < rightPointer) {
            int currWater = Math.min(list.get(leftPointer), list.get(rightPointer)) * (rightPointer - leftPointer);
            maxWater = Math.max(currWater, maxWater);
            if(list.get(leftPointer) < list.get(rightPointer)) {
                leftPointer++;
            }
            else {
                rightPointer--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(findMaxWaterCollected(list));
    }
}