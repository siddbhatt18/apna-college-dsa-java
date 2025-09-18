import java.util.*;
public class InbuiltPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pque1 = new PriorityQueue<>();
        pque1.add(3);
        pque1.add(4);
        pque1.add(1);
        pque1.add(7);
        while(pque1.isEmpty() != true) {
            System.out.print(pque1.peek() + " ");
            pque1.remove();
        }
        System.out.println();
        PriorityQueue<Integer> pque2 = new PriorityQueue<>(Comparator.reverseOrder());
        pque2.add(3);
        pque2.add(4);
        pque2.add(1);
        pque2.add(7);
        while(pque2.isEmpty() != true) {
            System.out.print(pque2.peek() + " ");
            pque2.remove();
        }
    }
}