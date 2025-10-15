public class LexicallySmallest {
    public static char[] printSmallestString(int n, int k) {
        char arr[] = new char[n];
        for(int i = 0; i < n; i++) {
            arr[i] = 'a';
            k--;
        }
        for(int i = n - 1; i >= 0; i--) {
            if(k >= 25) {
                arr[i] = (char)('a' + 25);
                k = k - 25;
            }
            else {
                arr[i] = (char)('a' + k);
                k = 0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 42;
        char result[] = printSmallestString(n, k);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}