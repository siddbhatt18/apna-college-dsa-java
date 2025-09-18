import java.util.*;
public class TreeMapBasics {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Russia", 50);
        System.out.println(tm);
        System.out.println(tm.get("India"));
        System.out.println(tm.get("USA"));
        System.out.println(tm.containsKey("China"));
        System.out.println(tm.containsKey("Japan"));
        System.out.println(tm.remove("Russia"));
        System.out.println(tm);
        System.out.println(tm.size());
        tm.clear();
        System.out.println(tm.isEmpty());
    }
}