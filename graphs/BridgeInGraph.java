import java.util.*;
public class BridgeInGraph {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int ldt[], boolean visited[], int time) {
        visited[curr] = true;
        ldt[curr] = dt[curr] = ++time;
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int nhbr = e.dst;
            if(nhbr == par) {
                continue;
            }
            else if(visited[nhbr] == false) {
                dfs(graph, nhbr, curr, dt, ldt, visited, time);
                ldt[curr] = Math.min(ldt[curr], ldt[nhbr]);
                if(dt[curr] < ldt[nhbr]) {
                    System.out.println(curr + "-" + nhbr);
                }
            }
            else if(visited[nhbr] == true) {
                ldt[curr] = Math.min(ldt[curr], dt[nhbr]);
            }
        }
    }
    public static void tarjans(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int ldt[] = new int[V];
        int time = 0;
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++) {
            if(visited[i] == false) {
                dfs(graph, i, -1, dt, ldt, visited, time);
            }
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjans(graph, V);
    }
}
