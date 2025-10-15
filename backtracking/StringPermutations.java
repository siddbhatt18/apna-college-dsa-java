public class StringPermutations {
    public static void findPermutations(String str, String ans) {
        if(str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}