public class UpperToLowerCase {
    public static String toLowerCase(String str) {
        StringBuilder newStr = new StringBuilder("");
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            newStr = newStr.append((char)(ch | 32));
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        System.out.println(toLowerCase(str));
    }
}