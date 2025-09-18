public class EvenOdd {
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
    public void rearrangeEvenOdd() {
        if(head == null) {
            return;
        }
        Node evenHead = null;
        Node evenTail = null;
        Node oddHead = null;
        Node oddTail = null;
        Node currNode = head;
        while(currNode != null) {
            int val = currNode.data;
            if(val % 2 == 0) {
                if(evenHead == null) {
                    evenHead = currNode;
                    evenTail = currNode;
                }
                else {
                    evenTail.next = currNode;
                    evenTail = currNode;
                }
            }
            else {
                if(oddHead == null) {
                    oddHead = currNode;
                    oddTail = currNode;
                }
                else {
                    oddTail.next = currNode;
                    oddTail = currNode;
                }
            }
            currNode = currNode.next;
        }
        head = evenHead;
        evenTail.next = oddHead;
        oddTail.next = null;
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
        EvenOdd link = new EvenOdd();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(4);
        link.addLast(5);
        link.addLast(6);
        link.rearrangeEvenOdd();
        link.printLinkedList();
    }
}