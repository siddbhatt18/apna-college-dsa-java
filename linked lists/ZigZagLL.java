public class ZigZagLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public Node printZigZag() {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node midNode = slow;
        Node prevNode = null;
        Node currNode = midNode.next;
        midNode.next = null;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        Node leftHead = head;
        Node rightHead = prevNode;
        while(leftHead != null && rightHead != null) {
            Node nextLeftHead = leftHead.next;
            leftHead.next = rightHead;
            Node nextRightHead = rightHead.next;
            rightHead.next = nextLeftHead;
            leftHead = nextLeftHead;
            rightHead = nextRightHead;
        }
        return head;
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
        ZigZagLL link = new ZigZagLL();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        link.printZigZag();
        link.printLinkedList();
    }
}