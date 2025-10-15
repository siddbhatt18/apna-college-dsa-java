public class DeleteNode {
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
    public void skipMDeleteN(int M, int N) {
        Node currNode = head;
        while(currNode != null) {
            int skip = 1;
            while(skip < M && currNode != null) {
                currNode = currNode.next;
                skip++;
            }
            if(currNode == null) {
                break;
            }
            Node temp = currNode.next;
            int delete = 0;
            while(delete < N && temp != null) {
                temp = temp.next;
                delete++;
            }
            currNode.next = temp;
            currNode = temp;
        }
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
        DeleteNode link = new DeleteNode();
        for(int i = 1; i <= 10; i++) {
            link.addLast(i);
        }
        link.skipMDeleteN(2, 2);
        link.printLinkedList();
    }
}