import java.util.*;
public class DecodeString {
    public static String decodeString(String str) {
        Stack<Integer> numStk = new Stack<>();
        Stack<String> strStk = new Stack<>();
        String currStr = "";
        int currNum = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch) == true) {
                currNum = currNum * 10 + (ch - '0');
            }
            else if(Character.isLetter(ch) == true) {
                currStr = currStr + ch;
            }
            else if(ch == '[') {
                numStk.push(currNum);
                strStk.push(currStr);
                currNum = 0;
                currStr = "";
            }
            else if(ch == ']') {
                int repeat = numStk.pop();
                StringBuilder prevStr = new StringBuilder(strStk.pop());
                for(int j = 0; j < repeat; j++) {
                    prevStr.append(currStr);
                }
                currStr = prevStr.toString();
            }
        }
        return currStr;
    }
    public static void main(String[] args) {
        System.out.println(decodeString("3[b2[v]]"));
    }
}