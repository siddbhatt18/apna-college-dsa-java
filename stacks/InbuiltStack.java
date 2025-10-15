import java.util.*;
public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        while(stk.isEmpty() != true) {
            System.out.println(stk.pop());
        }
    }
}