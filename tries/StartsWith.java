public class StartsWith {
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
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String str[] = {"apple", "app", "mango", "man", "woman"};
        for(int i = 0; i < str.length; i++) {
            insert(str[i]);
        }
        String prefix = "app";
        System.out.println(startsWith(prefix));
    }
}