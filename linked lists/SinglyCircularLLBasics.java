public class SinglyCircularLLBasics {
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
    public static int size;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }
    public void addMiddle(int data, int idx) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        if(idx == size - 1) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst() {
        if(size == 0) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        tail.next = head;
        size--;
        return val;
    }
    public int removeLast() {
        if(size == 0) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            return val;
        }
        Node temp = head;
        for(int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = head;
        tail = temp;
        size--;
        return val;
    }
    public int removeMiddle(int idx) {
        if(idx == 0) {
            return removeFirst();
        }
        if(idx == size - 1) {
            return removeLast();
        }
        Node temp = head;
        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }
    public void printLinkedList() {
        if(head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while(true) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            if(temp == head) {
                break;
            }
        }
        System.out.println("head");
    }
    public static void main(String[] args) {
        SinglyCircularLLBasics link = new SinglyCircularLLBasics();
        link.addFirst(1);
        link.addFirst(2);
        link.addLast(3);
        link.addLast(4);
        link.printLinkedList();
        System.out.println("size = " + size);
        link.addMiddle(5, 2);
        link.printLinkedList();
        System.out.println("size = " + size);
        System.out.println("removed = " + link.removeFirst());
        System.out.println("removed = " + link.removeLast());
        link.printLinkedList();
        System.out.println("size = " + size);
        System.out.println("removed = " + link.removeMiddle(1));
        link.printLinkedList();
        System.out.println("size = " + size);
    }
}