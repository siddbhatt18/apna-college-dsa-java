public class CheckPalindrome {
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
    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        Node mid = findMidNode(head);
        Node prevNode = null;
        Node currNode = mid;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        Node left = head;
        Node right = prevNode;
        while(right.next != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        CheckPalindrome link = new CheckPalindrome();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(2);
        link.addLast(1);
        System.out.println(link.checkPalindrome());
    }
}