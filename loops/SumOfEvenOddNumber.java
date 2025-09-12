import java.util.*;
public class SumOfEvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;
        for(int i = 1; i <= 5; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0) {
                evenSum = evenSum + num;
            }
            else {
                oddSum = oddSum + num;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        sc.close();
    }
}