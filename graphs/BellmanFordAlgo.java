import java.util.*;
public class BellmanFordAlgo {
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
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }
    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
        int distance[] = new int[graph.length];
        for(int i = 0; i < distance.length; i++) {
            if(i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0; i < graph.length - 1; i++) {
            for(int j = 0; j < graph.length; j++) {
                for(int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dst;
                    int wt = e.wt;
                    if(distance[u] != Integer.MAX_VALUE && distance[u] + wt < distance[v]) {
                        distance[v] = distance[u] + wt;
                    }
                }
            }
        }
        for(int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0);
    }
}