public class BSTBasics {
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
    public static boolean searchInBST(Node root, int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        else if(key > root.data) {
            return searchInBST(root.right, key);
        }
        else {
            return searchInBST(root.left, key);
        }
    }
    public static Node deleteInBST(Node root, int val) {
        if(val < root.data) {
            root.left = deleteInBST(root.left, val);
        }
        else if(val > root.data) {
            root.right = deleteInBST(root.right, val);
        }
        else {
            if(root.left == null && root.right == null) {
                return null;
            }
            if(root.left == null) {
                return root.right;
            }
            if(root.right == null) {
                return root.left;
            }
            Node inOrderSuccessor = findInOrderSuccessor(root.right);
            root.data = inOrderSuccessor.data;
            root.right = deleteInBST(root.right, inOrderSuccessor.data);
        }
        return root;
    }
    public static Node findInOrderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < values.length; i++) {
            root = insertInBST(root, values[i]);
        }
        inOrder(root);
        System.out.println(searchInBST(root, 3));
        root = deleteInBST(root, 1);
        inOrder(root);
    }
}