import java.util.*;
public class MergeKSortedLL {
    public static class Node implements Comparable<Node> {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public int compareTo(Node other) {
            return this.data - other.data;
        }
    }
    public static Node mergeLinkedList(Node arr[]) {
        PriorityQueue<Node> pque = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++) {
            Node currNode = arr[i];
            if(currNode != null) {
                pque.add(currNode);
            }
        }
        Node headNode = new Node(0);
        Node tail = headNode;
        while(pque.isEmpty() != true) {
            Node smallestNode = pque.remove();
            tail.next = smallestNode;
            tail = tail.next;
            if(smallestNode.next != null) {
                pque.add(smallestNode.next);
            }
        }
        return headNode.next;
    }
    public static void main(String[] args) {
        Node arr[] = new Node[3];
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(7);
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(8);
        arr[2] = new Node(9);
        arr[2].next = new Node(10);
        arr[2].next.next = new Node(11);
        Node result = mergeLinkedList(arr);
        Node temp = result;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}