import java.util.*;
public class KosarajuAlgo {
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
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }
    public static void topSortDFS(ArrayList<Edge> graph[], int curr, boolean visited[], Stack<Integer> stk) {
        visited[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int nhbr = e.dst;
            if(visited[nhbr] == false) {
                topSortDFS(graph, nhbr, visited, stk);
            }
        }
        stk.push(curr);
    }
    public static void createTranspose(ArrayList<Edge> graph[], ArrayList<Edge> transpose[]) {
        for(int i = 0; i < transpose.length; i++) {
            transpose[i] = new ArrayList<>();
        }
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int u = e.src;
                int v = e.dst;
                transpose[v].add(new Edge(v, u));
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.print(curr + " ");
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int nhbr = e.dst;
            if(visited[nhbr] == false) {
                dfs(graph, nhbr, visited);
            }
        }
    }
    public static void kosaraju(ArrayList<Edge> graph[]) {
        Stack<Integer> stk = new Stack<>();
        boolean visited[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(visited[i] == false) {
                topSortDFS(graph, i, visited, stk);
            }
        }
        ArrayList<Edge> transpose[] = new ArrayList[graph.length];
        createTranspose(graph, transpose);
        for(int i = 0; i < graph.length; i++) {
            visited[i] = false;
        }
        while(stk.isEmpty() != true) {
            int curr = stk.pop();
            if(visited[curr] == false) {
                dfs(transpose, curr, visited);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph);
    }
}