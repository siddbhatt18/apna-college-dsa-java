public class AVLTreeBasics {
    public static class Node {
        int data;
        int height;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }
    public static Node root;
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        return root.height;
    }
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node t2 = x.right.left;
        y.left = x;
        x.right = t2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node t2 = y.left.right;
        x.right = y;
        y.left = t2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }
    public static int getBalance(Node root) {
        if(root == null) {
            return 0;
        }
        int bf = height(root.left) - height(root.right);
        return bf;
    }
    public static Node insert(Node root, int val) {
        if(root == null) {
            return new Node(val);
        }
        if(val < root.data) {
            root.left = insert(root.left, val);
        }
        else if(val > root.data) {
            root.right = insert(root.right, val);
        }
        else {
            return root;
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int bf = getBalance(root);
        if(bf > 1 && val < root.left.data) {
            return rightRotate(root);
        }
        if(bf < -1 && val > root.right.data) {
            return leftRotate(root);
        }
        if(bf > 1 && val > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if(bf < -1 && val < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public static Node getMinNode(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static Node delNode(Node root, int key) {
        if(root == null) {
            return null;
        }
        if(key < root.data) {
            root.left = delNode(root.left, key);
        }
        else if(key > root.data) {
            root.right = delNode(root.right, key);
        }
        else {
            if(root.left == null || root.right == null) {
                Node temp = null;
                if(root.left == null) {
                    temp = root.right;
                }
                if(root.right == null) {
                    temp = root.left;
                }
                if(temp == null) {
                    temp = root;
                    root = null;
                }
                else {
                    root = temp;
                }
            }
            else {
                Node temp = getMinNode(root.right);
                root.data = temp.data;
                root.right = delNode(root.right, temp.data);
            }
        }
        if(root == null) {
            return null;
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int bf = getBalance(root);
        if(bf > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }
        if(bf < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }
        if(bf > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if(bf < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        preOrder(root);
        System.out.println();
        root = delNode(root, 40);
        preOrder(root);
    }
}