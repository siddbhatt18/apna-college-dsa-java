import java.util.*;
public class LowestCommonAncestor1 {
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
    public static boolean getPath(Node root, int target, ArrayList<Node> path) {
        if(root == null) {
            return false;   
        }
        path.add(root);
        if(root.data == target) {
            return true;
        }
        boolean foundLeft = getPath(root.left, target, path);
        boolean foundRight = getPath(root.right, target, path);
        if(foundLeft == true || foundRight == true) {
            return true;
        }
        else {
            path.remove(path.size() - 1);
            return false;
        }
    }
    public static Node findLowestCommonAncestor(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        boolean leftPath = getPath(root, n1, path1);
        boolean rightPath = getPath(root, n2, path2);
        if(leftPath != true || rightPath != true) {
            return null;
        }
        int idx = 0;
        while(idx < path1.size() && idx < path2.size()) {
            if(path1.get(idx) != path2.get(idx)) {
                break;
            }
            idx++;
        }
        return path1.get(idx - 1);
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