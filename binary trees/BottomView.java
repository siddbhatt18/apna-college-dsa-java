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
        int horizontalDist;
        public Info(Node node, int horizontalDist) {
            this.node = node;
            this.horizontalDist = horizontalDist;
        }
    }
    public static void bottomViewOfTree(Node root) {
        Queue<Info> que = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        que.add(new Info(root, 0));
        que.add(null);
        while(que.isEmpty() != true) {
            Info currInfo = que.remove();
            if(currInfo == null) {
                if(que.isEmpty() == true) {
                    break;
                }
                else {
                    que.add(null);
                }
            }
            else {
                Node currNode = currInfo.node;
                int horizontalDist = currInfo.horizontalDist;
                map.put(horizontalDist, currNode);
                if(currNode.left != null) {
                    que.add(new Info(currNode.left, horizontalDist - 1));
                    min = Math.min(min, horizontalDist - 1);
                }
                if(currNode.right != null) {
                    que.add(new Info(currNode.right, horizontalDist + 1));
                    max = Math.max(max, horizontalDist + 1);
                }
            }
        }
        for(int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        bottomViewOfTree(root);
    }
}