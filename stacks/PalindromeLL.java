import java.util.*;
public class PalindromeLL {
    public static class Node {
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
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static boolean isPalindrome() {
        Stack<Integer> stk = new Stack<>();
        if(head == null || head.next == null) {
            return true;
        }
        Node temp1 = head;
        while(temp1 != null) {
            stk.push(temp1.data);
            temp1 = temp1.next;
        }
        Node temp2 = head;
        while(temp2 != null) {
            int orgNum = temp2.data;
            int revNum = stk.pop();
            if(orgNum != revNum) {
                return false;
            }
            temp2 = temp2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeLL link = new PalindromeLL();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(2);
        link.addLast(1);
        System.out.println(isPalindrome());
    }
}