public class FloodFill {
    public static int[][] floodFill(int image[][], int sr, int sc, int color) {
        boolean visited[][] = new boolean[image.length][image[0].length];
        floodFillUtil(image, sr, sc, color, visited, image[sr][sc]);
        return image;
    }
    public static void floodFillUtil(int image[][], int sr, int sc, int color, boolean visited[][], int orgColor) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visited[sr][sc] == true || image[sr][sc] != orgColor) {
            return;
        }
        image[sr][sc] = color;
        visited[sr][sc] = true;
        floodFillUtil(image, sr, sc - 1, color, visited, orgColor);
        floodFillUtil(image, sr, sc + 1, color, visited, orgColor);
        floodFillUtil(image, sr - 1, sc, color, visited, orgColor);
        floodFillUtil(image, sr + 1, sc, color, visited, orgColor);
    }
    public static void printImage(int image[][]) {
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int image[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int result[][] = floodFill(image, sr, sc, newColor);
        printImage(result);
    }
}