public class TriesBasics {
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
    public static boolean search(String key) {
        Node curr = root;
        for(int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        if(curr.eow == true) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i = 0; i < str.length; i++) {
            insert(str[i]);
        }
        System.out.println(search("there"));
    }
}