import java.util.*;
public class ReverseStack {
    public static void reverseStack(Stack<Integer> stk) {
        if(stk.isEmpty() == true) {
            return;
        }
        int top = stk.pop();
        reverseStack(stk);
        pushAtBottom(stk, top);
    }
    public static void pushAtBottom(Stack<Integer> stk, int data) {
        if(stk.isEmpty() == true) {
            stk.push(data);
            return;
        }
        int top = stk.pop();
        pushAtBottom(stk, data);
        stk.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        reverseStack(stk);
        while(stk.isEmpty() != true) {
            System.out.println(stk.pop());
        }
    }
}