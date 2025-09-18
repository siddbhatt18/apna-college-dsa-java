import java.util.*;
public class GridWays1 {
    public static int findWays(int grid[][], int row, int col) {
        if(row == grid.length - 1 && col == grid[0].length - 1) {
            return 1;
        }
        if(row == grid.length || col == grid[0].length) {
            return 0;
        }
        int rightChoice = findWays(grid, row, col + 1);
        int downChoice = findWays(grid, row + 1, col);
        return rightChoice + downChoice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        int grid[][] = new int[rowNum][colNum];
        System.out.print(findWays(grid, 0, 0));
        sc.close();
    }
}