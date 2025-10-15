import java.util.*;
public class ConnectNRopesPQ {
    public static int connectRopes(int arr[]) {
        PriorityQueue<Integer> pque = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++) {
            pque.add(arr[i]);
        }
        int result = 0;
        while(pque.size() > 1) {
            int first = pque.poll();
            int second = pque.poll();
            int sum = first + second;
            result = result + sum;
            pque.add(sum);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 6};
        System.out.println(connectRopes(arr));
    }
}