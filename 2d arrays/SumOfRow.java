public class SumOfRow {
    public static int caculateSumOfRow(int matrix[][], int row) {
        int sum = 0; 
        for(int j = 0; j < matrix[0].length; j++) {
            sum = sum + matrix[row][j]; 
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = 1;
        System.out.println(caculateSumOfRow(matrix, row));
    }
}