public class PrintFrequency {
    public static int findFrequency(int matrix[][], int key) {
        int count = 0; 
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8}, {8, 8, 7}};
        int key = 7;
        System.out.println(findFrequency(matrix, key));
    }
}