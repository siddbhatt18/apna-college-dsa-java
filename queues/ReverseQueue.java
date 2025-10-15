import java.util.*;
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> que) {
        Stack<Integer> stk = new Stack<>();
        while(que.isEmpty() != true) {
            int val = que.remove();
            stk.push(val);
        }
        while(stk.isEmpty() != true) {
            int result = stk.pop();
            que.add(result);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        reverseQueue(que);
        while(que.isEmpty() != true) {
            System.out.print(que.remove() + " ");
        }
    }
}