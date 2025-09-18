import java.util.*;
public class MaxSlidingWindow {
    public static class Pair implements Comparable<Pair> {
        int val;
        int idx;
        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair other) {
            return other.val - this.val;
        }
    }   
    public static void solveSlidingWindowMax(int arr[], int k, int result[]) {
        PriorityQueue<Pair> pque = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            pque.add(new Pair(arr[i], i));
        }
        result[0] = pque.peek().val;
        for(int i = k; i < arr.length; i++) {
            while(pque.size() > 0 && pque.peek().idx <= i - k) {
                pque.remove();
            }
            pque.add(new Pair(arr[i], i));
            result[i - k + 1] = pque.peek().val;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int result[] = new int[arr.length - k + 1];
        solveSlidingWindowMax(arr, k, result);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}