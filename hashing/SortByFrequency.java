import java.util.*;
public class SortByFrequency {
    public static String sortByFrequency(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(hm.containsKey(ch) == true) {
                hm.put(ch, hm.get(ch) + 1);
            } 
            else {
                hm.put(ch, 1);
            }
        }
        ArrayList<Character> chars = new ArrayList<>(hm.keySet());
        Collections.sort(chars, (a, b) -> hm.get(b) - hm.get(a));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.size(); i++) {
            char ch = chars.get(i);
            for(int j = 0; j < hm.get(ch); j++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "tree";
        System.out.println(sortByFrequency(str));
    }
}