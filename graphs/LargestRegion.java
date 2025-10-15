public class LargestRegion {
    public static int largestRegion(int matrix[][]) {
        boolean visited[][] = new boolean[matrix.length][matrix[0].length];
        int maxRegion = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1 && visited[i][j] == false) {
                    int regionSize = largestRegionUtil(matrix, visited, i, j);
                    maxRegion = Math.max(maxRegion, regionSize);
                } 
            }
        }
        return maxRegion;
    }
    public static int largestRegionUtil(int matrix[][], boolean visited[][], int row, int col) {
        int direction[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        visited[row][col] = true;
        int size = 1;
        for(int i = 0; i < 8; i++) {
            int nhbrRow = row + direction[i][0];
            int nhbrCol = col + direction[i][1];
            if(nhbrRow >= 0 && nhbrRow < matrix.length && nhbrCol >= 0 && nhbrCol < matrix[0].length && matrix[nhbrRow][nhbrCol] == 1 && visited[nhbrRow][nhbrCol] == false) {
                size = size + largestRegionUtil(matrix, visited, nhbrRow, nhbrCol);
            }
        }
        return size;
    }
    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 1, 1, 0}, {1, 0, 1, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 1}};
        System.out.println(largestRegion(matrix));
    }
}