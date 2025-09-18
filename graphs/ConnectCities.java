import java.util.*;
public class ConnectCities {
    public static class Edge implements Comparable<Edge> {
        int dst;
        int cost;
        public Edge(int dst, int cost) {
            this.dst = dst;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge other) {
            return this.cost - other.cost;
        }
    }
    public static int connectCities(int cities[][]) {
        PriorityQueue<Edge> pque = new PriorityQueue<>();
        boolean visited[] = new boolean[cities.length];
        pque.add(new Edge(0, 0));
        int finalCost = 0;
        while(pque.isEmpty() != true) {
            Edge curr = pque.remove();
            if(visited[curr.dst] == false) {
                visited[curr.dst] = true;
                finalCost = finalCost + curr.cost;
                for(int i = 0; i < cities[curr.dst].length; i++) {
                    if(cities[curr.dst][i] != 0) {
                        pque.add(new Edge(i, cities[curr.dst][i]));
                    }
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        int cities[][] = {{0, 1, 2, 3, 4}, {1, 0, 5, 0, 7}, {2, 5, 0, 6, 0}, {3, 0, 6, 0, 0}, {4, 7, 0, 0, 0}};
        System.out.println(connectCities(cities));
    }
}