public class MaxBalancedPartition {
    public static int maxBalancedString(String str) {
        int countL = 0;
        int countR = 0;
        int totalCount = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'L') {
                countL++;
            }
            else {
                countR++;
            }
            if(countL == countR) {
                totalCount++;
                countL = 0;
                countR = 0;
            }
        }
        return totalCount;
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        System.out.println(maxBalancedString(str));
    }
}