public class CountSubStrings {
    public static int countSubString(String str, int start, int end, int len) {
        if(len == 1) {
            return 1;
        }
        if(len <= 0) {
            return 0;
        }
        int count = countSubString(str, start + 1, end, len - 1) + countSubString(str, start, end - 1, len - 1) - countSubString(str, start + 1, end - 1, len - 2);
        if(str.charAt(start) == str.charAt(end)) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int len = str.length();
        System.out.println(countSubString(str, 0, len - 1, len));
    }
}