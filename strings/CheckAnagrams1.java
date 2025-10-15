import java.util.*;
public class CheckAnagrams1 {
    public static boolean checkAnagram(String str1, String str2) {
        int count1[] = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }
        int count2[] = new int[26];
        for(int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }
        if(Arrays.equals(count1, count2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "abababccab";
        String str2 = "bbaabbacac";
        System.out.println(checkAnagram(str1, str2));
    }
}