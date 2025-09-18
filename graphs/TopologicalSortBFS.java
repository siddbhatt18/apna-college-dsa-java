import java.util.*;
public class TopologicalSortBFS {
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
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void topologicalSort(ArrayList<Edge> graph[]) {
        int indegree[] = new int[graph.length];
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int nhbr = e.dst;
                indegree[nhbr]++;
            }
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < indegree.length; i++) {
            if(indegree[i] == 0) {
                que.add(i);
            }
        }
        while(que.isEmpty() != true) {
            int curr = que.remove();
            System.out.print(curr + " ");
            for(int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                int nhbr = e.dst;
                indegree[nhbr]--;
                if(indegree[nhbr] == 0) {
                    que.add(nhbr);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topologicalSort(graph);
    }
}