import java.util.*;
public class FirstNonRepeating {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> que = new LinkedList<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            que.add(ch);
            freq[ch - 'a']++;
            while(que.isEmpty() != true && freq[que.peek() - 'a'] > 1) {
                que.remove();
            }
            if(que.isEmpty() == true) {
                System.out.print("-1" + " ");
            }
            else {
                System.out.print(que.peek() + " ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}