public class MaximumSumPath {
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
    public static int maxSum;
    public static int findMaxPathSum(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = findMaxPathSum(root.left);
        int rightSum = findMaxPathSum(root.right);
        int maxSingle = Math.max(root.data, Math.max(leftSum, rightSum) + root.data);
        int maxTop = Math.max(maxSingle, leftSum + rightSum + root.data);
        maxSum = Math.max(maxTop, maxSum);
        return maxSingle;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);
        maxSum = Integer.MIN_VALUE;
        findMaxPathSum(root);
        System.out.println(maxSum);
    }
}