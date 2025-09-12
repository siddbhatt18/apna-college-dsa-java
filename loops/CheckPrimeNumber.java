import java.util.*;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorCount = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                factorCount++;
            }
        }
        if(factorCount == 2) {
            System.out.println("prime");
        }
        else {
            System.out.println("composite");
        }
        sc.close();
    }
}