public class ToUpperCase {
    public static String convertToUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(Character.toUpperCase(ch));
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i - 1) == ' ') {
                ch = str.charAt(i);
                sb.append(Character.toUpperCase(ch));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(convertToUpperCase(str));
    }
}