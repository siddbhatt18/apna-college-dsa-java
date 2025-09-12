public class StringCompression {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        Integer count = 0;
        for(int i = 0; i < str.length(); i++) {
            count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if(count > 1) {
                sb.append(str.charAt(i) + count.toString());
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaaabbbccccdde";
        System.out.println(compress(str));
    }
}