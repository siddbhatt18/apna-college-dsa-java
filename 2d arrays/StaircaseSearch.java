public class StaircaseSearch {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                return true;
            } 
            else if(key > matrix[row][col]) {
                row++;
            } 
            else if(key < matrix[row][col]) {
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key = 45;
        System.out.println(staircaseSearch(matrix, key));
    }
}