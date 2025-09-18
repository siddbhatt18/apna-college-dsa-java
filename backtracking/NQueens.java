import java.util.*;
public class NQueens {
    public static boolean ifSafe(int board[][], int row, int col) {
        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 1) {
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 1) {
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
    static int count = 0;
    public static void solveNQueens(int board[][], int row) {
        if(row == board.length) {
            count++;
            printBoard(board);
            return;
        }
        for(int col = 0; col < board.length; col++) {
            if(ifSafe(board, row, col) == true) {
                board[row][col] = 1;
                solveNQueens(board, row + 1);
                board[row][col] = 0;
            }
        }   
    }
    public static void printBoard(int board[][]) {
        System.out.println("solution: " + count);
            for(int i = 0; i < board.length; i++) {
                for(int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }
        solveNQueens(board, 0);
        sc.close();
    }
}