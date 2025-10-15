public class UniqueSubString {
    public static class Node {
        Node child[] = new Node[26];
        boolean eow = false;
        public Node() {
            for(int i = 0; i < 26; i++) {
                child[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }
    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
            count = count + countNodes(root.child[i]);
        }
        return count + 1;
    }
    public static void main(String[] args) {
        String str = "ababa";
        for(int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}