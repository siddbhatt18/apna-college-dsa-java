import java.util.*;
public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            stk.push(str.charAt(i));
        }
        StringBuilder result = new StringBuilder("");
        while(stk.isEmpty() != true) {
            char ch = stk.pop();
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(reverseString(str));
    }
}