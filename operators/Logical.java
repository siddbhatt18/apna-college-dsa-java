public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println((a > b) && (c > d));
        System.out.println((a > b) && (c < d));
        System.out.println((a < b) && (c > d));
        System.out.println((a < b) && (c < d));
        System.out.println((a > b) || (c > d));
        System.out.println((a > b) || (c < d));
        System.out.println((a < b) || (c > d));
        System.out.println((a < b) || (c < d));
        System.out.println(!(a < b));
        System.out.println(!(c > d));
    }
}