public class SumOfNodes {
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
    public static int sumOfNodesOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOfNodesOfTree(root.left);
        int rightSum = sumOfNodesOfTree(root.right);
        int selfSum = leftSum + rightSum + root.data;
        return selfSum;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(sumOfNodesOfTree(root));
    }
}