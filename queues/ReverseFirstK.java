import java.util.*;
public class ReverseFirstK {
    public static void reverseQueue(Queue<Integer> que, int k) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < k; i++) {
            int val = que.remove();
            stk.push(val);
        }
        while(stk.isEmpty() != true) {
            int val = stk.pop();
            que.add(val);
        }
        for(int i = 0; i < que.size() - k; i++) {
            int result = que.remove();
            que.add(result);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= 10; i++) {
            que.add(i);
        }
        int k = 5;
        reverseQueue(que, k);
        while(que.isEmpty() != true) {
            System.out.print(que.remove() + " ");
        }
    }
}