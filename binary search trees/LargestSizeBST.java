public class LargestSizeBST {
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
    public static class Info {
        boolean isValidBST;
        int size;
        int min;
        int max;
        public Info(boolean isValidBST, int size, int min, int max) {
            this.isValidBST = isValidBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;
    public static Info findLargestBST(Node root) {
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftSubtree = findLargestBST(root.left);
        Info rightSubtree = findLargestBST(root.right);
        int size = leftSubtree.size + rightSubtree.size + 1;
        int min = Math.min(root.data, Math.max(leftSubtree.min, rightSubtree.min));
        int max = Math.max(root.data, Math.max(leftSubtree.max, rightSubtree.max));
        if(root.data <= leftSubtree.max || root.data >= rightSubtree.min) {
            return new Info(false, size, min, max);
        }
        if(leftSubtree.isValidBST == true && rightSubtree.isValidBST == true) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        findLargestBST(root);
        System.out.println(maxBST);
    }
}