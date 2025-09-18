import java.util.*;
public class TreeSetBasics {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(4);
        ts.add(2);
        ts.add(3);
        ts.add(2);
        System.out.println(ts);
        System.out.println(ts.contains(1));
        System.out.println(ts.contains(5));
        ts.remove(4);
        System.out.println(ts);
        System.out.println(ts.contains(4));
        System.out.println(ts.size());
        ts.clear();
        System.out.println(ts.isEmpty());
    }
}