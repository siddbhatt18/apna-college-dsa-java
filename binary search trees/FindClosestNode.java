public class FindClosestNode {
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
    public static int findClosest(Node root, int target) {
        int closest = root.data;
        while(root != null) {
            int currentDiff = Math.abs(root.data - target);
            int closestDiff = Math.abs(closest - target);
            if(currentDiff < closestDiff) {
                closest = root.data;
            }
            if(target > root.data) {
                root = root.right;
            }
            else if(target < root.data) {
                root = root.left;
            }
            else {
                break;
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14, 20};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertInBST(root, values[i]);
        }
        int target = 19;
        System.out.println(findClosest(root, target));
    }
}