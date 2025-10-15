public class WordBreak {
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
    public static boolean breakWord(String key) {
        if(key.length() == 0) {
            return true;
        }
        for(int i = 1; i <= key.length(); i++) {
            String first = key.substring(0, i);
            String second = key.substring(i);
            if(search(first) == true && breakWord(second) == true) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        String key = "ilikesamsung";
        for(int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        System.out.println(breakWord(key));
    }
}