public class SwapNodes {
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
    public void swapNodes(int x, int y) {
        if(x == y) {
            return;
        }
        Node prevNodeX = null;
        Node currNodeX = head;
        while(currNodeX != null && currNodeX.data != x) {
            prevNodeX = currNodeX;
            currNodeX = currNodeX.next;
        }
        Node prevNodeY = null;
        Node currNodeY = head;
        while(currNodeY != null && currNodeY.data != y) {
            prevNodeY = currNodeY;
            currNodeY = currNodeY.next;
        }
        if(currNodeX == null || currNodeY == null) {
            return;
        }
        if(prevNodeX != null) {
            prevNodeX.next = currNodeY;
        } else {
            head = currNodeY;
        }
        if(prevNodeY != null) {
            prevNodeY.next = currNodeX;
        } else {
            head = currNodeX;
        }
        Node temp = currNodeX.next;
        currNodeX.next = currNodeY.next;
        currNodeY.next = temp;
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
        SwapNodes link = new SwapNodes();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(4);
        link.swapNodes(2, 4);
        link.printLinkedList();
    }
}