public class ShortestPath {
    public static double findShortestPath(String path) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'N') {
                y++;
            }
            if(path.charAt(i) == 'S') {
                y--;
            }
            if(path.charAt(i) == 'E') {
                x++;
            }
            if(path.charAt(i) == 'W') {
                x--;
            }
        }
        return Math.sqrt(x * x + y * y);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(findShortestPath(path));
    }
}