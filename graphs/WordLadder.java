import java.util.*;
public class WordLadder {
    public static boolean differByOne(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        int diff = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                diff++;
            }
            if(diff > 1) {
                return false;
            }
        }
        return true;
    }
    public static int wordLadderLength(String start, String target, ArrayList<String> dictionary) {
        HashSet<String> wordSet = new HashSet<>(dictionary);
        if(wordSet.contains(target) == false) {
            return 0;
        }
        Queue<String> que = new LinkedList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        que.add(start);
        hm.put(start, 1);
        while(que.isEmpty() != true) {
            String curr = que.remove();
            int currDistance = hm.get(curr);
            if(curr.equals(target) == true) {
                return currDistance;
            }
            for(String word : wordSet) {
                if(hm.containsKey(word) == false && differByOne(curr, word) == true) {
                    hm.put(word, currDistance + 1);
                    que.add(word);
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String dictionary[] = {"hot", "dot", "dog", "lot", "log", "cog"};
        String start = "hit";
        String target = "cog";
        System.out.println(wordLadderLength(start, target, new ArrayList<>(Arrays.asList(dictionary))));
    }
}