import java.util.*;
public class Palindrome {
    public static boolean checkPalindrome(int num) {
        int orgNum = num;
        int revNum = 0;
        while(num != 0) {
            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }
        if(revNum == orgNum) {
            return true;
        } 
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPalindrome(n));
        sc.close();
    }
}