import java.util.*;
public class LinkedHSBasics {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(4);
        lhs.add(1);
        lhs.add(2);
        System.out.println(lhs);
        System.out.println(lhs.contains(1));
        System.out.println(lhs.contains(5));
        lhs.remove(4);
        System.out.println(lhs);
        System.out.println(lhs.contains(4));
        System.out.println(lhs.size());
        lhs.clear();
        System.out.println(lhs.isEmpty());
    }
}