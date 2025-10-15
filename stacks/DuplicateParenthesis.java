import java.util.*;
public class DuplicateParenthesis {
    public static boolean checkDuplicateParenthesis(String str) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ')') {
                stk.push(ch);
            }
            else {
                int count = 0;
                while(stk.peek() != '(') {
                    stk.pop();
                    count++;
                }
                if(count < 1) {
                    return true;
                }
                else {
                    stk.pop();
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(checkDuplicateParenthesis(str));
    }
}