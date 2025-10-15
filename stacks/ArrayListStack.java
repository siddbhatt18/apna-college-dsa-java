import java.util.*;
public class ArrayListStack {
    public static class Stack {
        ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty() {
            if(list.size() == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        public void push(int data) {
            list.add(data);
        }
        public int pop() {
            if(list.size() == 0) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        public int peek() {
            if(list.size() == 0) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
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