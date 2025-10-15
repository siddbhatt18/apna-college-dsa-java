public class MergeSort {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node mergeSortLinkedList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node midNode = findMidNode(head);
        Node leftHead = head;
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeftHead = mergeSortLinkedList(leftHead);
        Node newRightHead = mergeSortLinkedList(rightHead);
        return mergeLinkedList(newLeftHead, newRightHead);
    }
    public Node mergeLinkedList(Node leftHead, Node rightHead) {
        Node result = new Node(-1);
        Node temp = result;
        while(leftHead != null && rightHead != null) {
            if(leftHead.data <= rightHead.data) {
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            }
            else {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }
        while(leftHead != null) {
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }
        while(rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }
        return result.next;
    }
    public void printLinkedList(Node var) {
        if(var == null) {
            System.out.println("empty");
            return;
        }
        Node temp = var;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        MergeSort link = new MergeSort();
        head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);
        Node result = link.mergeSortLinkedList(head);
        link.printLinkedList(result);
    }
}