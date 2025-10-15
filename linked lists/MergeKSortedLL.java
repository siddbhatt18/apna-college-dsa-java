public class MergeKSortedLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node mergeLinkedList(Node head1, Node head2) {
        Node result = new Node(-1);
        Node temp = result;
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return result.next;
    }
    public Node mergeKLists(Node list[], int k) {
        if(list == null || k == 0) {
            return null;
        }
        while(k > 1) {
            int idx = 0;
            for(int i = 0; i < k; i = i + 2) {
                if(i + 1 < k) {
                    list[idx] = mergeLinkedList(list[i], list[i + 1]);
                }
                else {
                    list[idx] = list[i];
                }
                idx++;
            }
            k = idx;
        }
        return list[0];
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
        MergeKSortedLL link = new MergeKSortedLL();
        Node list[] = new Node[3];
        list[0] = new Node(1);
        list[0].next = new Node(4);
        list[0].next.next = new Node(7);
        list[1] = new Node(2);
        list[1].next = new Node(5);
        list[1].next.next = new Node(8);
        list[2] = new Node(3);
        list[2].next = new Node(6);
        list[2].next.next = new Node(9);
        Node sorted = link.mergeKLists(list, 3);
        link.printLinkedList(sorted);
    }
}