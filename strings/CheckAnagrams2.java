import java.util.*;
public class CheckAnagrams2 {
    public static boolean checkAnagram(String str1, String str2) {
        char ch1[] = str1.toCharArray();
        Arrays.sort(ch1);
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)) {
            return true;
        } 
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "abababccab";
        String str2 = "bbaabbacac";
        System.out.println(checkAnagram(str1, str2));
    }
}