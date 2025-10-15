import java.util.*;
public class TaxCalculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float sum = pen + pencil + eraser;
        System.out.println(sum);
        float tax = 0.18f * sum;
        System.out.println(tax);
        float total = sum + tax;
        System.out.println(total);
        sc.close();
    }
}