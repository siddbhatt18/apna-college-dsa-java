import java.util.*;
public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);
        System.out.println(hs.contains(1));
        System.out.println(hs.contains(5));
        hs.remove(4);
        System.out.println(hs);
        System.out.println(hs.contains(4));
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs.isEmpty());
    }
}