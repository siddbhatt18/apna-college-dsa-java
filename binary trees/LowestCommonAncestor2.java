public class LowestCommonAncestor2 {
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
    public static Node findLowestCommonAncestor(Node root, int n1, int n2) {
        if(root == null) {
            return null;
        }
        if(root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftSubtree = findLowestCommonAncestor(root.left, n1, n2);
        Node rightSubtree = findLowestCommonAncestor(root.right, n1, n2);
        if(leftSubtree == null) {
            return rightSubtree;
        }
        if(rightSubtree == null) {
            return leftSubtree;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(findLowestCommonAncestor(root, 4, 5).data);
    }
}