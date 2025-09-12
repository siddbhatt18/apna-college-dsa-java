import java.util.*;
public class InputMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        float price = sc.nextFloat();
        System.out.println(str);
        System.out.println(num);
        System.out.println(price);
        sc.close();
    }
}