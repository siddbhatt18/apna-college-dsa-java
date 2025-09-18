import java.util.*;
public class GridWays2 {
    public static int findFactorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int findWays(int grid[][], int row, int col) {
        int downChoice = findFactorial(row - 1);
        int rightChoice = findFactorial(col - 1);
        int totalChoice = findFactorial((row - 1) + (col - 1));
        return (totalChoice / (downChoice * rightChoice));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        int grid[][] = new int[rowNum][colNum];
        System.out.print(findWays(grid, rowNum, colNum));
        sc.close();
    }
}