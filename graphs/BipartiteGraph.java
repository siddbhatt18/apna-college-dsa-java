import java.util.*;
public class BipartiteGraph {
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
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }
    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        int color[] = new int[graph.length];
        for(int i = 0; i < color.length; i++) {
            color[i] = -1;
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < graph.length; i++) {
            if(color[i] == -1) {
                que.add(i);
                color[i] = 0;
                while(que.isEmpty() != true) {
                    int curr = que.remove();
                    for(int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        int nhbr = e.dst;
                        if(color[nhbr] == -1) {
                            if(color[curr] == 0) {
                                color[nhbr] = 1;
                            }
                            else {
                                color[nhbr] = 0;
                            }
                            que.add(nhbr);
                        }
                        else if(color[curr] == color[nhbr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}