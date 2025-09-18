import java.util.*;
public class PrintKNearestPoints {
    public static class Point implements Comparable<Point>{
        int x;
        int y;
        int distance;
        public Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
        @Override
        public int compareTo(Point other) {
            return this.distance - other.distance;
        }
    }
    public static void main(String[] args) {
        int points[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        PriorityQueue<Point> pque = new PriorityQueue<>();
        for(int i = 0; i < points.length; i++) {
            int distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pque.add(new Point(points[i][0], points[i][1], distance));
        }
        for(int i = 0; i < k; i++) {
            System.out.println(pque.peek().x + " " + pque.peek().y);
            pque.remove();
        }
    }
}