public class RecursiveSearch {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int recursiveSearch(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = recursiveSearch(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx + 1;
    }
    public static void main(String[] args) {
        RecursiveSearch link = new RecursiveSearch();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(4);
        link.addLast(5);
        System.out.println(link.recursiveSearch(head, 3));
        System.out.println(link.recursiveSearch(head, 6));
    }
}