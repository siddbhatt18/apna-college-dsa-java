import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        int temp = (int) num;
        System.out.println(temp);
        char ch = 'a';
        int val = ch;
        System.out.println(val);
        sc.close();
    }
}