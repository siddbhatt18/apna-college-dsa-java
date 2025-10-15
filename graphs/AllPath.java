import java.util.*;
public class AllPath {
    public static class Edge {
        int src;
        int dst;
        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void printAllPath(ArrayList<Edge> graph[], int src, int dst, String path) {
        if(src == dst) {
            System.out.println(path + dst);
            return;
        }
        for(int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            int nhbr = e.dst;
            String newPath = path + src;
            printAllPath(graph, nhbr, dst, newPath);
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 5;
        int dst = 1;
        printAllPath(graph, src, dst, "");
    }
}