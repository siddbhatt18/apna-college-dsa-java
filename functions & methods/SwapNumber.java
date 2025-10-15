public class SwapNumber {
    public static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNumbers(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}