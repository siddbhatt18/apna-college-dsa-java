public class RemoveCycle {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycleExists = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycleExists = true;
                break;
            }
        }
        if(cycleExists == false) {
            System.out.println("no cycle");
            return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
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
        RemoveCycle link = new RemoveCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        link.removeCycle();
        link.printLinkedList();
    }
}