public class MaxSumOfBST {
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
        int sum;
        int min;
        int max;
        public Info(boolean isValidBST, int sum, int min, int max) {
            this.isValidBST = isValidBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxSum = 0;
    public static Info findMaxSumBST(Node root) {
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftSubtree = findMaxSumBST(root.left);
        Info rightSubtree = findMaxSumBST(root.right);
        int sum = leftSubtree.sum + rightSubtree.sum + root.data;
        int min = Math.min(root.data, leftSubtree.min);
        int max = Math.max(root.data, rightSubtree.max);
        if(root.data <= leftSubtree.max || root.data >= rightSubtree.min) {
            return new Info(false, sum, min, max);
        }
        if(leftSubtree.isValidBST == true && rightSubtree.isValidBST == true) {
            maxSum = Math.max(maxSum, sum);
            return new Info(true, sum, min, max);
        }
        return new Info(false, sum, min, max);
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
        findMaxSumBST(root);
        System.out.println(maxSum);
    }
}