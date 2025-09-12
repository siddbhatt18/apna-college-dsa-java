import java.util.*;
public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while(num != 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
        sc.close();
    }
}