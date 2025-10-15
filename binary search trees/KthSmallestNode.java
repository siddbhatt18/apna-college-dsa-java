public class KthSmallestNode {
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
    public static int count = 0;
    public static Node findKthSmallest(Node root, int k) {
        if(root == null) {
            return null;
        }
        Node leftSmallest = findKthSmallest(root.left, k);
        if(leftSmallest != null) {
            return leftSmallest;
        }
        count++;
        if(count == k) {
            return root;
        }
        Node rightSmallest = findKthSmallest(root.right, k);
        return rightSmallest;
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 11, 20};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertInBST(root, values[i]);
        }
        int k = 3;
        System.out.println(findKthSmallest(root, k).data);
    }
}