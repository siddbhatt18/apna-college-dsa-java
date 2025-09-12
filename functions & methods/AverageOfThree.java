import java.util.*;
public class AverageOfThree {
    public static int findAverage(int x, int y, int z) {
        int avg = (x + y + z) / 3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(findAverage(a, b, c));
        sc.close();
    }
}