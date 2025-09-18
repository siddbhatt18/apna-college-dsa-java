public class FindSubtree {
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
    public static boolean isIdentical(Node root, Node subroot) {
        if(root == null && subroot == null) {
            return true;
        }
        else if(root == null || subroot == null || root.data != subroot.data) {
            return false;
        }
        boolean leftIdentical = isIdentical(root.left, subroot.left);
        boolean rightIdentical = isIdentical(root.right, subroot.right);
        if(leftIdentical == true && rightIdentical == true) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isSubtree(Node root, Node subroot) {
        if(root == null) {
            return false;
        }
        if(subroot == null) {
            return true;
        }
        if(root.data == subroot.data && isIdentical(root, subroot) == true) {
            return true;
        }
        boolean leftSubtree = isSubtree(root.left, subroot);
        boolean rightSubtree = isSubtree(root.right, subroot);
        if(leftSubtree == true || rightSubtree == true) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println(isSubtree(root, subroot));
    }
}