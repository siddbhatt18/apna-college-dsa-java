import java.util.*;
public class PushAtBottom {
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
        stk.push(4);
        pushAtBottom(stk, 5);
        while(stk.isEmpty() != true) {
            System.out.println(stk.pop());
        }
    }
}