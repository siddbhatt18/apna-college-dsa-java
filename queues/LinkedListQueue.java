public class LinkedListQueue {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue {
        Node head = null;
        Node tail = null;
        public boolean isEmpty() {
            if(head == null && tail == null) {
                return true;
            }
            else {
                return false;
            }
        }
        public void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public int remove() {
            if(isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = head.data;
            if(head == tail) {
                head = null;
                tail = null;   
            }
            else {
                head = head.next;
            }
            return result;
        }
        public int peek() {
            if(isEmpty() == true) {
                System.out.println("empty");
                return -1;
            }
            int result = head.data;
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
