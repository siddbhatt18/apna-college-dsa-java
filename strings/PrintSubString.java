public class PrintSubString {
    public static void printSubString(String str, int start, int end) {
        String subStr = "";
        for(int i = start; i < end; i++) {
            subStr = subStr + str.charAt(i);
        }
        System.out.println(subStr);
    }
    public static void main(String[] args) {
        String str = "encyclopedia";
        int start = 3;
        int end = 8;
        printSubString(str, start, end);
    }
}