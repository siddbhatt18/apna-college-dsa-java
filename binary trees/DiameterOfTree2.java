public class DiameterOfTree2 {
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
        int diameter;
        int height;
        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static int heightOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static Info diameterOfTree(Node root) {
        if(root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameterOfTree(root.left);
        Info rightInfo = diameterOfTree(root.right);
        int selfDiameter = leftInfo.height + rightInfo.height + 1;
        int diameter = Math.max(selfDiameter, Math.max(leftInfo.diameter, rightInfo.diameter));
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(diameter, height);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameterOfTree(root).diameter);
        System.out.println(diameterOfTree(root).height);        
    }
}