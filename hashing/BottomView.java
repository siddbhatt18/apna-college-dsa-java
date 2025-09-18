import java.util.*;
public class BottomView {
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
        Node node;
        int hd;
        int depth;
        public Info(Node node, int hd, int depth) {
            this.node = node;
            this.hd = hd;
            this.depth = depth;
        }
    }
    public static void findBottomView(Node root) {
        if(root == null) {
            return;
        }
        TreeMap<Integer, int[]> tm = new TreeMap<>();
        Queue<Info> que = new LinkedList<>();
        que.add(new Info(root, 0, 0));
        while(que.isEmpty() != true) {
            Info curr = que.remove();
            Node node = curr.node;
            int hd = curr.hd;
            int depth = curr.depth;
            if(tm.containsKey(hd) != true || depth >= tm.get(hd)[1]) {
                tm.put(hd, new int[] {node.data, depth});
            }
            if(node.left != null) {
                que.add(new Info(node.left, hd - 1, depth + 1));
            }
            if(node.right != null) {
                que.add(new Info(node.right, hd + 1, depth + 1));
            }
        }
        for(int key : tm.keySet()) {
            System.out.print(tm.get(key)[0] + " ");    
        }
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        findBottomView(root);
    }
}