import java.util.*;
public class BreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.print(n + " ");
        } while(true);
        sc.close();
    }
}