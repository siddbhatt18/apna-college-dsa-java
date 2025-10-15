public class LengthOfString {
    public static int findStringLength(String str, int count) {
        if(str.length() == 0) {
            return count;
        }
        String subStr = str.substring(1);
        return findStringLength(subStr, count + 1);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(findStringLength(str, 0));
    }
}