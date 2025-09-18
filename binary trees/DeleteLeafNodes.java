public class DeleteLeafNodes {
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
    public static Node deleteLeafNode(Node root, int x) {
        if(root == null) {
            return null;
        }
        root.left = deleteLeafNode(root.left, x);
        root.right = deleteLeafNode(root.right, x);
        if(root.data == x && root.left == null && root.right == null) {
            return null;
        }
        else {
            return root;
        }
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
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        int x = 3;
        root = deleteLeafNode(root, x);
        preOrder(root); 
    }
}