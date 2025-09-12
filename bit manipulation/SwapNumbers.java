public class SwapNumbers {
    public static void swapNumbers(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b); 
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        swapNumbers(a, b);
    }
}