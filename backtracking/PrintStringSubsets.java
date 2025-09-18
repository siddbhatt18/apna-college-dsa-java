public class PrintStringSubsets {
    public static void findSubsets(String str, String ans, int idx) {
        if(idx == str.length()) {
            if(ans.length() == 0) {
                System.out.print("NULL");
            }
            else {
                System.out.print(ans + " ");
            }
            return;
        }
        findSubsets(str, ans + str.charAt(idx), idx + 1);
        findSubsets(str, ans, idx + 1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}