public class MinimumNodeDistance {
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
    public static int findDistanceFromLCA(Node root, int target) {
        if(root == null) {
            return -1;
        }
        if(root.data == target) {
            return 0;
        }
        int leftDistance = findDistanceFromLCA(root.left, target);
        int rightDistance = findDistanceFromLCA(root.right, target);
        if(leftDistance != -1) {
            return leftDistance + 1;
        }
        if(rightDistance != -1) {
            return rightDistance + 1;
        }
        return -1;
    }
    public static int findMinDistance(Node root, int n1, int n2) {
        Node lowestCommonAncestor = findLowestCommonAncestor(root, n1, n2);
        int distance1 = findDistanceFromLCA(lowestCommonAncestor, n1);
        int distance2 = findDistanceFromLCA(lowestCommonAncestor, n2);
        return distance1 + distance2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 5;
        System.out.println(findMinDistance(root, n1, n2));
    }
}