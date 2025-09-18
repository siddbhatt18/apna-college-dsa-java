import java.util.*;
public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("delhi");
        city.add("mumbai");
        city.add("kolkata");
        city.add("chennai");
        for(String str : city) {
            System.out.println(str);
        }
    }
}