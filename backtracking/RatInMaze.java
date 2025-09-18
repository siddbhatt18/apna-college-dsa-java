public class RatInMaze {
    public static boolean isSafe(int maze[][], int row, int col) {
        if(row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean solveMaze(int maze[][], int row, int col, int path[][]) {
        if(row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] == 1) {
            path[row][col] = 1;
            return true;
        }
        if(isSafe(maze, row, col) == true) {
            path[row][col] = 1;
            if(solveMaze(maze, row + 1, col, path) == true) {
                return true;
            }
            if(solveMaze(maze, row, col + 1, path) == true) {
                return true;
            }
            path[row][col] = 0;
        }
        return false;
    }
    public static void printMaze(int arr[][]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 1, 1, 1}};
        int n = maze.length;
        int path[][] = new int[n][n];
        System.out.println("question: ");
        printMaze(maze);
        if(solveMaze(maze, 0, 0, path) == true) {
            System.out.println("solution: ");
            printMaze(path);
        }
        else {
            System.out.println("no solution");
        }
    }
}