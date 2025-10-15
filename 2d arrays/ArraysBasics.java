import java.util.*;
public class ArraysBasics {
    public static boolean searchMatrix(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int matrix[][] = new int[3][3];
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++) { 
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();
        boolean result = searchMatrix(matrix, key);
        System.out.println(result);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}