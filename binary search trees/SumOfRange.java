public class SumOfRange {
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
    public static Node insertInBST(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(val < root.data) {
            root.left = insertInBST(root.left, val);
        }
        else {
            root.right = insertInBST(root.right, val);
        }
        return root;
    }
    public static int sumOfRange(Node root, int k1, int k2) {
        if(root == null) {
            return 0;
        }
        if(root.data >= k1 && root.data <= k2) {
            int leftSum = sumOfRange(root.left, k1, k2);
            int rightSum = sumOfRange(root.right, k1, k2);
            return root.data + leftSum + rightSum;
        }
        else if(root.data < k1) {
            return sumOfRange(root.right, k1, k2);
        }
        else {
            return sumOfRange(root.left, k1, k2);
        }
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertInBST(root, values[i]);
        }
        int k1 = 5;
        int k2 = 12;
        System.out.println(sumOfRange(root, k1, k2));
    }
}