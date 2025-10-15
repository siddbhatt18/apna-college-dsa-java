public class ClosedIslands {
    public static void removeBorder(int grid[][]) {
        int rows = grid.length;
        int cols = grid[0].length;
        for(int j = 0; j < cols; j++) {
            if(grid[0][j] == 1) {
                removeIslands(grid, 0, j);
            }
            if(grid[rows - 1][j] == 1) {
                removeIslands(grid, rows - 1, j);
            }
        }
        for(int i = 0; i < rows; i++) {
            if(grid[i][0] == 1) {
                removeIslands(grid, i, 0);
            }
            if(grid[i][cols - 1] == 1) {
                removeIslands(grid, i, cols - 1);
            }
        }
    }
    public static int countIslands(int grid[][]) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i = 1; i < rows - 1; i++) {
            for(int j = 1; j < cols - 1; j++) {
                if(grid[i][j] == 1) {
                    removeIslands(grid, i ,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void removeIslands(int grid[][], int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        if(i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 0;
        removeIslands(grid, i - 1, j);
        removeIslands(grid, i + 1, j);
        removeIslands(grid, i, j - 1);
        removeIslands(grid, i, j + 1);
    }
    public static void main(String[] args) {
        int grid[][] = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
        removeBorder(grid);
        System.out.println(countIslands(grid));
    }
}
