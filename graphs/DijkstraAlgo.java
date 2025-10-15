import java.util.*;
public class DijkstraAlgo {
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
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    public static class Pair implements Comparable<Pair> {
        int node;
        int path;
        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }
        @Override
        public int compareTo(Pair other) {
            return this.path - other.path;
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        int distance[] = new int[graph.length];
        boolean visited[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Pair> pque = new PriorityQueue<>();
        pque.add(new Pair(src, 0));
        while(pque.isEmpty() != true) {
            Pair curr = pque.remove();
            if(visited[curr.node] == false) {
                visited[curr.node] = true;
                for(int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dst;
                    int wt = e.wt;
                    if(distance[u] + wt < distance[v]) {
                        distance[v] = distance[u] + wt;
                        pque.add(new Pair(v, distance[v]));
                    }
                }
            }
        }
        for(int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0);
    }
}
