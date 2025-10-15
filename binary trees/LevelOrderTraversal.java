import java.util.*;
public class LevelOrderTraversal {
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
    public static class BinaryTree {
        int idx = -1;
        public Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public void levelOrder(Node root) {
            if(root == null) {
                return;
            }
            Queue<Node> que = new LinkedList<>();
            que.add(root);
            que.add(null);
            while(que.isEmpty() != true) {
                Node currNode = que.remove();
                if(currNode == null) {
                    System.out.println();
                    if(que.isEmpty() == true) {
                        break;
                    }
                    else {
                        que.add(null);
                    }
                }
                else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) {
                        que.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        que.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);
    }
}