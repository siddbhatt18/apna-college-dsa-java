import java.util.*;
public class GroupAnagrams {
    public static class Node {
        Node child[] = new Node[26];
        boolean eow = false;
        ArrayList<String> data;
        public Node() {
            for(int i = 0; i < 26; i++) {
                child[i] = null;
            }
            data = new ArrayList<>();
        }
    }
    public static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        char chars[] = word.toCharArray();
        Arrays.sort(chars);
        for(int i = 0; i < chars.length; i++) {
            int idx = chars[i] - 'a';
            if(curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
        curr.data.add(word);
    }
    public static void collectAnagrams(Node curr, ArrayList<ArrayList<String>> result) {
        if(curr == null) {
            return;
        }
        if(curr.eow == true) {
            result.add(curr.data);
        }
        for(int i = 0; i < 26; i++) {
            if(curr.child[i] != null) {
                collectAnagrams(curr.child[i], result);
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        for(int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        collectAnagrams(root, result);
        System.out.println(result);
    }
}