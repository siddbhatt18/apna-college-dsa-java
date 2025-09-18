import java.util.*;
public class ValidAnagram {
    public static boolean checkAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(hm.containsKey(ch) == true) {
                hm.put(ch, hm.get(ch) + 1);
            }
            else {
                hm.put(ch, 1);
            }
        }
        for(int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if(hm.containsKey(ch) == true) {
                if(hm.get(ch) == 1) {
                    hm.remove(ch);
                }
                else {
                    hm.put(ch, hm.get(ch) - 1);
                }
            }
            else {
                return false;
            }
        }
        if(hm.isEmpty() == true) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";
        System.out.println(checkAnagram(str1, str2));
    }
}