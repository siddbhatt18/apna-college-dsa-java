import java.util.*;
public class InbuiltDeque {
    public static void main(String[] args) {
        Deque<Integer> deq = new LinkedList<>();
        deq.addFirst(1);
        deq.addFirst(2);
        deq.addFirst(3);
        while(deq.isEmpty() != true) {
            System.out.print(deq.removeFirst() + " ");
        }
        System.out.println();
        deq.addLast(4);
        deq.addLast(5);
        deq.addLast(6);
        while(deq.isEmpty() != true) {
            System.out.print(deq.removeLast() + " ");
        }
        System.out.println();
        deq.addFirst(7);
        deq.addLast(8);
        System.out.println(deq.getFirst());
        System.out.println(deq.getLast());
    }
}