import java.util.*;
public class RootToLeafPath {
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
    public static void printRootToLeafPath(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        printRootToLeafPath(root.left, path);
        printRootToLeafPath(root.right, path);
        path.remove(path.size() - 1);
    }
    public static void printPath(ArrayList<Integer> path) {
        for(int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < values.length; i++) {
            root = insertInBST(root, values[i]);
        }
        printRootToLeafPath(root, new ArrayList<>());
    }
}