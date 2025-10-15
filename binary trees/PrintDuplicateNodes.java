import java.util.*;
public class PrintDuplicateNodes {
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
    public static HashMap<String, Integer> map = new HashMap<>();
    public static String findDuplicateNodes(Node root) {
        if(root == null) {
            return "#";
        }
        String leftSubtree= findDuplicateNodes(root.left);
        String rightSubtree = findDuplicateNodes(root.right);
        String subString = "(" + leftSubtree + "," + root.data + "," + rightSubtree + ")";
        int count = 0;
        if(map.containsKey(subString) == true) {
            count = map.get(subString);
        }
        if(count == 1) {
            System.out.print(root.data + " ");
        }
        map.put(subString, count + 1);
        return subString;
    }   
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.right = new Node(4);
        root.right.left.left = new Node(4);
        findDuplicateNodes(root);
    }
}