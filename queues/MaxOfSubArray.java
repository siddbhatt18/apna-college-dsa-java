import java.util.*;
public class MaxOfSubArray {
    public static void printMaximumSubArray(int arr[], int k) {
        Deque<Integer> dque = new LinkedList<>();
        for(int i = 0; i < k; i++) {
            while(dque.isEmpty() != true && arr[i] > arr[dque.peekLast()]) {
                dque.removeLast();
            }
            dque.addLast(i);
        }
        for(int i = k; i < arr.length; i++) {
            System.out.print(arr[dque.peek()] + " ");
            while(dque.isEmpty() != true && dque.peek() <= i - k) {
                dque.removeFirst();
            }
            while(dque.isEmpty() != true && arr[i] >= arr[dque.peekLast()]) {
                dque.removeLast();
            }
            dque.addLast(i);
        }
        System.out.print(arr[dque.peek()]);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        printMaximumSubArray(arr, k);
    }
}