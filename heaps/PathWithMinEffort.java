import java.util.*;
public class PathWithMinEffort {
    public static class Cell implements Comparable<Cell>{
        int row;
        int col;
        int cost;
        public Cell(int row, int col, int cost) {
            this.row = row;
            this.col = col;
            this.cost = cost;
        }
        @Override
        public int compareTo(Cell other) {
            return this.cost - other.cost;
        }
    }
    public static int minCostPath(int grid[][]) {
        int row = grid.length;
        int col = grid[0].length;
        int cost[][] = new int[row][col];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                cost[i][j] = Integer.MAX_VALUE;
            }
        }
        cost[0][0] = grid[0][0];
        PriorityQueue<Cell> pque = new PriorityQueue<>();
        pque.add(new Cell(0, 0, cost[0][0]));
        int rowMovement[] = {-1, 1, 0, 0};
        int colMovement[] = {0, 0, -1, 1};
        while(pque.isEmpty() != true) {
            Cell current = pque.remove();
            int currRow = current.row;
            int currCol = current.col;
            int currCost = current.cost;
            if(currCost > cost[currRow][currCol]) {
                continue;
            }
            for(int i = 0; i < 4; i++) {
                int neighbourRow = currRow + rowMovement[i];
                int neighbourCol = currCol + colMovement[i];
                if(neighbourRow >= 0 && neighbourRow < row && neighbourCol >= 0 && neighbourCol < col) {
                    int newCost = currCost + grid[neighbourRow][neighbourCol];
                    if(newCost < cost[neighbourRow][neighbourCol]) {
                        cost[neighbourRow][neighbourCol] = newCost;
                        pque.add(new Cell(neighbourRow, neighbourCol, newCost));
                    }
                }
            }
        }
        return cost[row - 1][col - 1];
    }
    public static void main(String[] args) {
        int grid[][] = {{31, 100, 65, 12, 18}, {10, 13, 47, 157, 6}, {100, 113, 174, 11, 33}, {88, 124, 41, 20, 140}, {99, 32, 111, 41, 20}};
        System.out.println(minCostPath(grid));
    }
}