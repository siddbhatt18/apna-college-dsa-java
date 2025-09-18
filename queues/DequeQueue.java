import java.util.*;
public class DequeQueue {
    public static class Stack {
        Deque<Integer> deq = new LinkedList<>();
        public boolean isEmpty() {
            if(deq.isEmpty() == true) {
                return true;
            }
            else {
                return false;
            }
        }
        public void push(int data) {
            deq.addLast(data);
        }
        public int pop() {
            int result = deq.removeFirst();
            return result;
        }
        public int peek() {
            int result = deq.getFirst();
            return result;
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        while(stk.isEmpty() != true) {
            System.out.print(stk.pop() + " ");
        }
    }
}