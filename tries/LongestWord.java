public class LongestWord {
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
    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp) {
        if(root == null) {
            return;
        }
        for(int i = 0; i < 26; i++) {
            if(root.child[i] != null && root.child[i].eow == true) {
                char ch = (char)(i + 'a');
                temp.append(ch);
                if(temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.child[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
    public static void main(String[] args) {
        String str[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i = 0; i < str.length; i++) {
            insert(str[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}