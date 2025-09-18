import java.util.*;
public class PrimsAlgo {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }
    public static class Pair implements Comparable<Pair> {
        int vertex;
        int cost;
        public Pair(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair other) {
            return this.cost - other.cost;
        }
    }
    public static int prims(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pque = new PriorityQueue<>();
        pque.add(new Pair(0, 0));
        int minCost = 0;
        while(pque.isEmpty() != true) {
            Pair curr = pque.remove();
            if(visited[curr.vertex] == false) {
                visited[curr.vertex] = true;
                minCost = minCost + curr.cost;
                for(int i = 0; i < graph[curr.vertex].size(); i++) {
                    Edge e = graph[curr.vertex].get(i);
                    int nhbr = e.dst;
                    int wt = e.wt;
                    pque.add(new Pair(nhbr, wt));
                }
            }
        }
        return minCost;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(prims(graph));
    }
}