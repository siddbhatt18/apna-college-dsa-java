import java.util.*;
public class ContinueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            if(n % 10 == 0) {
                continue;
            }
            System.out.print(n + " ");
        }
        sc.close();
    }
}