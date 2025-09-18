import java.util.*;
public class HalveArraySum {
    public static int findMinOperations(ArrayList<Integer> arr) {
        PriorityQueue<Double> pque = new PriorityQueue<>(Collections.reverseOrder());
        double initialSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            initialSum = initialSum + arr.get(i);
            pque.add((double)arr.get(i));
        }
        double targetSum = initialSum / 2.0;
        double currentSum = initialSum;
        int operations = 0;
        while(currentSum > targetSum) {
            double largest = pque.remove();
            double newLargest = largest / 2.0;
            currentSum = currentSum - newLargest;
            pque.add(newLargest);
            operations++;
        }
        return operations;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(8);
        arr.add(19);
        System.out.println(findMinOperations(arr));
    }
}