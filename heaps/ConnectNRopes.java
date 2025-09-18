import java.util.*;
public class ConnectNRopes {
    public static int connectNRopes(int ropes[]) {
        PriorityQueue<Integer> pque = new PriorityQueue<>();
        for(int i = 0; i < ropes.length; i++) {
            pque.add(ropes[i]);
        }
        int cost = 0;
        while(pque.size() > 1) {
            int firstMin = pque.remove();
            int secondMin = pque.remove();
            int minSum = firstMin + secondMin;
            cost = cost + minSum;
            pque.add(minSum);
        }
        return cost;
    }
    public static void main(String[] args) {
        int ropes[] = {2, 3, 3, 4, 6};
        System.out.println(connectNRopes(ropes));
    }
}