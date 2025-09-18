import java.util.*;
public class RottingOranges {
    public static class Node {
        int row;
        int col;
        int time;
        public Node(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public static int timeToRot(int grid[][]) {
        Queue<Node> que = new LinkedList<>();
        int freshCount = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 2) {
                    que.add(new Node(i, j, 0));
                }
                else if(grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        int direction[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int time = 0;
        while(que.isEmpty() != true) {
            Node curr = que.remove();
            time = Math.max(time, curr.time);
            for(int i = 0; i < 4; i++) {
                int nhbrRow = curr.row + direction[i][0];
                int nhbrCol = curr.col + direction[i][1];
                if(nhbrRow >= 0 && nhbrRow < grid.length && nhbrCol >= 0 && nhbrCol < grid[0].length && grid[nhbrRow][nhbrCol] == 1) {
                    grid[nhbrRow][nhbrCol] = 2;
                    freshCount--;
                    que.add(new Node(nhbrRow, nhbrCol, time + 1));
                }
            }
        }
        if(freshCount == 0) {
            return time;
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int grid[][] = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(timeToRot(grid));
    }
}