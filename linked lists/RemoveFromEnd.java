public class RemoveFromEnd {
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
    public void removeNthNodeFromEnd(int n) {
        int size = 0;
        Node temp1 = head;
        while(temp1 != null) {
            temp1 = temp1.next;
            size++;
        }
        if(n == size) {
            head = head.next;
            return;
        }
        int idx = size - n;
        Node temp2 = head;
        for(int i = 0; i < idx - 1; i++) {
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
    }
    public void printLinkedList() {
        if(head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        RemoveFromEnd link = new RemoveFromEnd();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(4);
        link.addLast(5);
        link.printLinkedList();
        link.removeNthNodeFromEnd(2);
        link.printLinkedList();
    }
}