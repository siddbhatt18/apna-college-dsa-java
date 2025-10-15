public class Intersection {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head1;
    public static Node head2;
    public void addLast1(int data) {
        Node newNode = new Node(data);
        if(head1 == null) {
            head1 = newNode;
            return;
        }
        Node temp = head1;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void addLast2(int data) {
        Node newNode = new Node(data);
        if(head2 == null) {
            head2 = newNode;
            return;
        }
        Node temp = head2;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public int getLength(Node head) {
        int length = 0;
        Node temp = head;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
    public Node findIntersection() {
        if(head1 == null || head2 == null) {
            return null;
        }
        int len1 = getLength(head1);
        int len2 = getLength(head2);
        Node currNode1 = head1;
        Node currNode2 = head2;
        int diff = Math.abs(len1 - len2);
        if(len1 > len2) {
            for(int i = 0; i < diff; i++) {
                currNode1 = currNode1.next;
            }
        }
        else {
            for(int i = 0; i < diff; i++) {
                currNode2 = currNode2.next;
            }
        }
        while(currNode1 != null && currNode2 != null) {
            if(currNode1 == currNode2) {
                return currNode1;
            }
            currNode1 = currNode1.next;
            currNode2 = currNode2.next;
        }
        return null;
    }
    public void joinLinkedLists(int data) {
        Node intersectNode = new Node(data);
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1.next != null) {
            temp1 = temp1.next;
        }
        while(temp2.next != null) {
            temp2 = temp2.next;
        }
        temp1.next = intersectNode;
        temp2.next = intersectNode;
    }
    public void printLinkedList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Intersection link = new Intersection();
        link.addLast1(10);
        link.addLast1(15);
        link.addLast2(3);
        link.addLast2(6);
        link.addLast2(9);
        link.joinLinkedLists(30);
        link.printLinkedList(head1);
        link.printLinkedList(head2);
        Node result = link.findIntersection();
        System.out.println(result.data);
    }
}