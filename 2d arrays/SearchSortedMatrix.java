public class SearchSortedMatrix {
    public static boolean binarySearchMatrix(int matrix[][], int key) {
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;
            if(matrix[row][col] == key) {
                return true;
            }
            else if(matrix[row][col] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int key = 23;
        System.out.println(binarySearchMatrix(matrix, key));
    }
}