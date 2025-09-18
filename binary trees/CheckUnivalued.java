public class CheckUnivalued {
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
    public static boolean isUnivalued(Node root) {
        if(root == null) {
            return true;
        }
        boolean leftSubtree = isUnivalued(root.left);
        boolean rightSubtree = isUnivalued(root.right);
        if(leftSubtree != true || rightSubtree != true) {
            return false;
        }
        if(root.left != null && root.left.data != root.data) {
            return false;
        }
        if(root.right != null && root.right.data != root.data) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        System.out.println(isUnivalued(root));
    }
}