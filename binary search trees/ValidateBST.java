public class ValidateBST {
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
    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }
        if(min != null && root.data <= min.data) {
            return false;
        }
        if(max != null && root.data >= max.data) {
            return false;
        }
        boolean leftSubtree = isValidBST(root.left, min, root);
        boolean rightSubtree = isValidBST(root.right, root, max);
        return leftSubtree && rightSubtree;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(2);
        root.left.right = new Node(9);
        System.out.println(isValidBST(root, null, null));
    }
}