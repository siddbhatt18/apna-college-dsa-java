import java.util.*;
public class CheapestFlight {
    public static class Edge {
        int src;
        int dst;
        int wt;
        public Edge(int src, int dst, int wt) {
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int flight[][]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dst = flight[i][1];
            int wt = flight[i][2];
            Edge e = new Edge(src, dst, wt);
            graph[src].add(e);
        }
    }
    public static class Info {
        int vertex;
        int cost;
        int stops;
        public Info(int vertex, int cost, int stops) {
            this.vertex = vertex;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public static int cheapestFlight(int flights[][], int n, int src, int dst, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, flights);
        int distance[] = new int[n];
        for(int i = 0; i < distance.length; i++) {
            if(i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> que = new LinkedList<>();
        que.add(new Info(src, 0, 0));
        while(que.isEmpty() != true) {
            Info curr = que.remove();
            if(curr.stops > k) {
                break;
            }
            for(int i = 0; i < graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);
                int v = e.dst;
                int wt = e.wt;
                if(curr.cost + wt < distance[v] && curr.stops <= k) {
                    distance[v] = curr.cost + wt;
                    que.add(new Info(v, distance[v], curr.stops + 1));
                }
            }
        }
        if(distance[dst] == Integer.MAX_VALUE) {
            return -1;
        }
        else {
            return distance[dst];
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int flights[][] = {{0, 1, 100}, {1, 2, 200}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0;
        int dst = 3;
        int k = 1;
        System.out.println(cheapestFlight(flights, n, src, dst, k));
    }
}
