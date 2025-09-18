public class KnightTour {
    public static boolean isSafe(int row, int col, int board[][]) {
        if(row >= 0 && row < 8 && col >= 0 && col < 8 && board[row][col] == -1) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean knightMoves(int row, int col, int move, int board[][]) {
        int rowMoves[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int colMoves[] = {1, 2, 2, 1, -1, -2, -2, -1};
        if(move == board.length * board.length) {
            return true;
        }
        for(int k = 0; k < board.length; k++) {
            int nextRow = row + rowMoves[k];
            int nextCol = col + colMoves[k];
            if(isSafe(nextRow, nextCol, board) == true) {
                board[nextRow][nextCol] = move;
                if(knightMoves(nextRow, nextCol, move + 1, board) == true) {
                    return true;
                }
                board[nextRow][nextCol] = -1;
            }
        }
        return false;
    }
    public static void printBoard(int board[][]) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int board[][] = new int[8][8];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = -1;
            }
        }
        board[0][0] = 0;
        if(knightMoves(0, 0, 1, board) == true) {
            printBoard(board);
        }
        else {
            System.out.println("no solution");
        }
    }
}