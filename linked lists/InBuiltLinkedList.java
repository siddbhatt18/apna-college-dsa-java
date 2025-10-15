import java.util.*;
public class InBuiltLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.addFirst(1);
        link.addFirst(2);
        link.addLast(3);
        link.addLast(4);
        System.out.println(link);
        link.removeFirst();
        link.removeLast();
        System.out.println(link);
    }
}