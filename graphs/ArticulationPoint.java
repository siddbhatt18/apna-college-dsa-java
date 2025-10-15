import java.util.*;
public class ArticulationPoint {
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
        graph[4].add(new Edge(4, 3));
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int ldt[], int time, boolean visited[], boolean ap[]) {
        visited[curr] = true;
        ldt[curr] = dt[curr] = ++time;
        int children = 0;
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int nhbr = e.dst;
            if(par == nhbr) {
                continue;
            }
            else if(visited[nhbr] == true) {
                ldt[curr] = Math.min(ldt[curr], dt[nhbr]);
            }
            else if(visited[nhbr] == false) {
                dfs(graph, nhbr, curr, dt, ldt, time, visited, ap);
                ldt[curr] = Math.min(ldt[curr], ldt[nhbr]);
                if(par != -1 && dt[curr] <= ldt[nhbr]) {
                    ap[curr] = true;
                }
                children++;
            }
        }
        if(par == -1 && children > 1) {
            ap[curr] = true;
        }
    }
    public static void getAP(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int ldt[] = new int[V];
        int time = 0;
        boolean visited[] = new boolean[V];
        boolean ap[] = new boolean[V];
        for(int i = 0; i < V; i++) {
            if(visited[i] == false) {
                dfs(graph, i, -1, dt, ldt, time, visited, ap);
            }
        }
        for(int i = 0; i < V; i++) {
            if(ap[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);
    }
}
