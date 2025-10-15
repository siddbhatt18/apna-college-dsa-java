import java.util.*;
public class BalanceBST2 {
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
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if(root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    public static Node balanceGivenBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        getInorder(root, arr);
        root = createBST(arr, 0, arr.size() - 1);
        return root;
    }
    public static Node createBST(ArrayList<Integer> arr, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }
    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.right.right.right = new Node(12);
        root = balanceGivenBST(root);
        preOrder(root);
    }
}