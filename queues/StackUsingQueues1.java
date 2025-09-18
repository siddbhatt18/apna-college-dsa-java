import java.util.*;
public class StackUsingQueues1 {
    public static class Stack {
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();
        public boolean isEmpty() {
            if(que1.isEmpty() == true && que2.isEmpty() == true) {
                return true;
            }
            else {
                return false;
            }
        }
        public void push(int data) {
            if(que1.isEmpty() != true) {
                que1.add(data);
            }
            else if(que2.isEmpty() != true) {
                que2.add(data);
            }
            else {
                que1.add(data);
            }
        }
        public int pop() {
            if(que1.isEmpty() == true && que2.isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = -1;
            if(que1.isEmpty() != true) {
                while(que1.isEmpty() != true) {
                    result = que1.remove();
                    if(que1.isEmpty() == true) {
                        break;
                    }
                    que2.add(result);
                }
            }
            else if(que2.isEmpty() != true) {
                while(que2.isEmpty() != true) {
                    result = que2.remove();
                    if(que2.isEmpty() == true) {
                        break;
                    }
                    que1.add(result);
                }
            }
            return result;
        }
        public int peek() {
            if(que1.isEmpty() == true && que2.isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = -1;
            if(que1.isEmpty() != true) {
                while(que1.isEmpty() != true) {
                    result = que1.remove();
                    que2.add(result);
                }
            }
            if(que2.isEmpty() != true) {
                while(que2.isEmpty() != true) {
                    result = que2.remove();
                    que1.add(result);
                }
            }
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