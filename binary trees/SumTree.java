public class SumTree {
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
    public static int findSumTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = findSumTree(root.left);
        int rightSum = findSumTree(root.right);
        int currData = root.data;
        root.data = leftSum + rightSum;
        return currData + root.data;
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
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        findSumTree(root);
        preOrder(root);
    }
}