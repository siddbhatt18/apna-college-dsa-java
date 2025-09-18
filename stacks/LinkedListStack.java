public class LinkedListStack {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
        Node head = null;
        public boolean isEmpty() {
            if(head == null) {
                return true;
            }
            else {
                return false;
            }
        }
        public void push(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public int pop() {
            if(head == null) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek() {
            if(head == null) {
                return -1;
            }
            int top = head.data;
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