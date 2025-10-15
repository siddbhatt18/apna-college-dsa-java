import java.util.*;
public class DepthFirstSearch {
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
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));
    }
    public static void dfs(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(visited[i] == false) {
                dfsUtil(graph, i, visited);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.print(curr + " ");
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int nhbr = e.dst;
            if(visited[nhbr] == false) {
                dfsUtil(graph, nhbr, visited);
            } 
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dfs(graph);
    }
}