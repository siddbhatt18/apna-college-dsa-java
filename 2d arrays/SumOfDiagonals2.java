public class SumOfDiagonals2 {
    public static int findSumOfDiagonals(int matrix[][]) {
        int sum = 0; 
        for(int i = 0; i < matrix.length; i++) {
            int j = matrix.length - 1 - i; 
            sum = sum + matrix[i][i];
            if(i != j) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(findSumOfDiagonals(matrix));
    }
}