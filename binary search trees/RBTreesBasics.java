public class RBTreesBasics {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node parent;
        boolean isRed;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.parent = null;
            this.isRed = true;
        }
    }
    public static Node root;
    public static void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if(y.left != null) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if(x.parent == null) {
            root = y;
        }
        else if(x == x.parent.left) {
            x.parent.left = y;
        }
        else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }
    public static void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if(y.right != null) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if(x.parent == null) {
            root = y;
        }
        else if(x == x.parent.left) {
            x.parent.left = y;
        }
        else {
            x.parent.right = y;
        }
        y.right = x;
        x.parent = y;
    }
    public static void fixInsert(Node z) {
        while(z.parent != null && z.parent.isRed == true) {
            if(z.parent == z.parent.parent.left) {
                Node y = z.parent.parent.right;
                if(y != null && y.isRed) {
                    z.parent.isRed = false;
                    y.isRed = false;
                    z.parent.parent.isRed = true;
                    z = z.parent.parent;
                } 
                else {
                    if(z == z.parent.right) {
                        z = z.parent;
                        leftRotate(z);
                    }
                    z.parent.isRed = false;
                    z.parent.parent.isRed = true;
                    rightRotate(z.parent.parent);
                }
            } 
            else {
                Node y = z.parent.parent.left; 
                if(y != null && y.isRed) {
                    z.parent.isRed = false;
                    y.isRed = false;
                    z.parent.parent.isRed = true;
                    z = z.parent.parent;
                } 
                else {
                    if(z == z.parent.left) {
                        z = z.parent;
                        rightRotate(z);
                    }
                    z.parent.isRed = false;
                    z.parent.parent.isRed = true;
                    leftRotate(z.parent.parent);
                }
            }
        }
        if(root!=null){root.isRed = false;}
    }
    public static void insert(int data) {
        Node z = new Node(data);
        Node y = null;
        Node x = root;
        while(x != null) {
            y = x;
            if(z.data < x.data) {
                x = x.left;
            }
            else if(z.data > x.data){
                x = x.right;
            }
            else{
                return;
            }
        }
        z.parent = y;
        if(y == null) {
            root = z;
        }
        else if(z.data < y.data) {
            y.left = z;
        }
        else {
            y.right = z;    
        }
        fixInsert(z);
    }
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        char colour;
        if(root.isRed == true) {
            colour = 'R';
        }
        else {
            colour = 'B';
        }
        inOrder(root.left);
        System.out.print(root.data + ":" + colour + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int[] values = {1, 4, 6, 3, 5, 7, 8, 2, 9};
        for (int i = 0; i < values.length; i++) {
            insert(values[i]);
        }
        inOrder(root);
    }
}