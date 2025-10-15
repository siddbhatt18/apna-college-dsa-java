import java.util.*;
public class ValidParenthesis {
    public static boolean checkValidParenthesis(String str) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            }
            else {
                if(stk.isEmpty() == true) {
                    return false;
                }
                if((ch == ')' && stk.peek() == '(') || (ch == '}' && stk.peek() == '{') || (ch == ']' && stk.peek() == '[')) {
                    stk.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(stk.isEmpty() == true) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "(({[]}){})";
        System.out.println(checkValidParenthesis(str));
    }
}