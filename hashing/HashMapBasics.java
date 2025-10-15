import java.util.*;
public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Russia", 50);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.get("USA"));
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Japan"));
        System.out.println(hm.remove("Russia"));
        System.out.println(hm);
        System.out.println(hm.size());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}