public class TilingProblem {
    public static int findMaxTiles(int breadth) {
        if(breadth == 0) {
            return 1;
        }
        if(breadth == 1) {
            return 1;
        }
        int verticalWays = findMaxTiles(breadth - 1);
        int horizontalWays = findMaxTiles(breadth - 2);
        return verticalWays + horizontalWays;
    }
    public static void main(String[] args) {
        int breadth = 5;
        System.out.println(findMaxTiles(breadth));
    }
}