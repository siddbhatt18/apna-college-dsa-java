import java.util.*;
public class ProductOfTwo {
    public static int calculateProduct(int x, int y) {
        int product = x * y;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateProduct(a, b));
        sc.close();
    }
}