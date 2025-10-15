import java.util.*;
public class StringBasics {
    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        String str1 = "tony";
        String str2 = new String("stark");
        System.out.println(str1 + " " + str2);
        Scanner sc = new Scanner(System.in);
        String str3 = sc.nextLine();
        int n = str3.length();
        System.out.println(n);
        printLetters(str3);
        sc.close();
    }
}