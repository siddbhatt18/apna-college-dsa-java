import java.util.*;
public class UndirectedGraphCycleBFS {
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
    public static class Pair {
        int node;
        int parent;
        public Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }
    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(visited[i] == false) {
                if(detectCycleUtil(graph, visited, i) == true) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean visited[], int src) {
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(src, -1));
        visited[src] = true;
        while(que.isEmpty() != true) {
            Pair curr = que.remove();
            for(int i = 0; i < graph[curr.node].size(); i++) {
                Edge e = graph[curr.node].get(i);
                int nhbr = e.dst;
                if(visited[nhbr] == false) {
                    visited[nhbr] = true;
                    que.add(new Pair(nhbr, curr.node));
                }
                else if(nhbr != curr.parent) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}