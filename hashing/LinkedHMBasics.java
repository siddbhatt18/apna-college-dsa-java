import java.util.*;
public class LinkedHMBasics {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Russia", 50);
        System.out.println(lhm);
        System.out.println(lhm.get("India"));
        System.out.println(lhm.get("USA"));
        System.out.println(lhm.containsKey("China"));
        System.out.println(lhm.containsKey("Japan"));
        System.out.println(lhm.remove("Russia"));
        System.out.println(lhm);
        System.out.println(lhm.size());
        lhm.clear();
        System.out.println(lhm.isEmpty());
    }
}
