import java.util.*;
public class TwoSumBST {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insertInBST(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(val < root.data) {
            root.left = insertInBST(root.left, val);
        }
        else {
            root.right = insertInBST(root.right, val);
        }
        return root;
    }
    public static int countPairs(Node root1, Node root2, int target) {
        if(root1 == null || root2 == null) {
            return 0;
        }
        Stack<Node> stk1 = new Stack<>();
        Stack<Node> stk2 = new Stack<>();
        Node curr1 = root1;
        Node curr2 = root2;
        int count = 0;
        while(true) {
            while(curr1 != null) {
                stk1.push(curr1);
                curr1 = curr1.left;
            }
            while(curr2 != null) {
                stk2.push(curr2);
                curr2 = curr2.right;
            }
            if(stk1.isEmpty() == true || stk2.isEmpty() == true) {
                break;
            }
            Node top1 = stk1.peek();
            Node top2 = stk2.peek();
            int sum = top1.data + top2.data;
            if(sum < target) {
                stk1.pop();
                curr1 = top1.right; 
            }
            else if(sum > target) {
                stk2.pop();
                curr2 = top2.left;
            }
            else {
                count++;
                stk1.pop();
                stk2.pop();
                curr1 = top1.right;
                curr2 = top2.left;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int values1[] = {5, 3, 7, 2, 4, 6, 8};
        int values2[] = {10, 6, 15, 3, 8, 11, 18};
        Node root1 = null;
        Node root2 = null;
        for (int i = 0; i < values1.length; i++) {
            root1 = insertInBST(root1, values1[i]);
        }
        for(int i = 0; i < values2.length; i++) {
            root2 = insertInBST(root2, values2[i]);
        }
        int target = 16;
        System.out.println(countPairs(root1, root2, target));
    }
}