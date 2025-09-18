import java.util.*;
public class QueueUsingStacks1 {
    public static class Queue {
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        public boolean isEmpty() {
            if(stk1.isEmpty() == true) {
                return true;
            }
            else {
                return false;
            }
        }
        public void add(int data) {
            while(stk1.isEmpty() != true) {
                int result = stk1.pop();
                stk2.push(result);
            }
            stk1.push(data);
            while(stk2.isEmpty() != true) {
                int result = stk2.pop();
                stk1.push(result);
            }
        }
        public int remove() {
            if(stk1.isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = stk1.pop();
            return result;
        }
        public int peek() {
            if(stk1.isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = stk1.peek();
            return result;
        }
    }
    public static void main(String[] args) {
        Queue que = new Queue();
        que.add(1);
        que.add(2);
        que.add(3);
        while(que.isEmpty() != true) {
            System.out.println(que.remove());
        }
    }
}