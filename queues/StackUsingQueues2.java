import java.util.*;
public class StackUsingQueues2 {
    public static class Stack {
        Queue<Integer> que1 = new ArrayDeque<>();
        Queue<Integer> que2 = new ArrayDeque<>();
        public boolean isEmpty() {
            if(que1.isEmpty() == true) {
                return true;
            }
            else {
                return false;
            }
        }
        public void push(int data) {
            que2.add(data);
            while(que1.isEmpty() != true) {
                int result = que1.remove();
                que2.add(result);
            }
            Queue<Integer> temp = que1;
            que1 = que2;
            que2 = temp;
        }
        public int pop() {
            if(que1.isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = que1.remove();
            return result;
        }
        public int peek() {
            if(que1.isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = que1.peek();
            return result;
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        while(stk.isEmpty() != true) {
            System.out.println(stk.pop());
        }
    }
}