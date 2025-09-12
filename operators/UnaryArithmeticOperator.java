public class UnaryArithmeticOperator {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = ++a1;
        System.out.println(a1);
        System.out.println(a2);
        int b1 = 20;
        int b2 = --b1;
        System.out.println(b1);
        System.out.println(b2);
        int c1 = 30;
        int c2 = c1++;
        System.out.println(c1);
        System.out.println(c2);
        int d1 = 40;
        int d2 = d1--;
        System.out.println(d1);
        System.out.println(d2);
    }
}