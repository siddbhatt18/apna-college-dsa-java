public class MatrixTranspose {
    public static void displayMatrix(int matrix[][]) {
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[0].length; j++) { 
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
    public static void findTranspose(int matrix[][]) {
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < transpose[0].length; i++) {     
            for(int j = 0; j < transpose.length; j++) {     
                transpose[i][j] = matrix[j][i]; 
            }
        }
        displayMatrix(transpose);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        displayMatrix(matrix);
        findTranspose(matrix);
    }
}