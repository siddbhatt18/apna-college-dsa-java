import java.util.*;
public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> que1 = new LinkedList<>();
        que1.add(1);
        que1.add(2);
        que1.add(3);
        while(que1.isEmpty() != true) {
            System.out.println(que1.remove());
        }
        Queue<Integer> que2 = new ArrayDeque<>();
        que2.add(4);
        que2.add(5);
        que2.add(6);
        while(que2.isEmpty() != true) {
            System.out.println(que2.remove());
        }
    }
}