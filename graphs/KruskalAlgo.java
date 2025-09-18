import java.util.*;
public class KruskalAlgo {
    public static class Edge implements Comparable<Edge> {
        int src;
        int dst;
        int wt;
        public Edge(int src, int dst, int wt) {
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
        @Override
        public int compareTo(Edge other) {
            return this.wt - other.wt;
        }
    }
    public static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }
    static int n = 4;
    static int parent[] = new int[n];
    static int rank[] = new int[n];
    public static void init() {
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    public static int find(int x) {
        if(parent[x] == x) {
            return x;
        }
        return find(parent[x]);
    }
    public static void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if(rank[parentA] == rank[parentB]) {
            parent[parentB] = parentA;
            rank[parentA]++;
        }
        else if(rank[parentA] < rank[parentB]) {
            parent[parentA] = parentB;
        }
        else {
            parent[parentB] = parentA;
        }
    }
    public static int kruskal(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;
        for(int i = 0; count < V - 1; i++) {
            Edge e = edges.get(i);
            int u = e.src;
            int v = e.dst;
            int wt = e.wt;
            int parentA = find(u);
            int parentB = find(v);
            if(parentA != parentB) {
                union(u, v);
                mstCost = mstCost + wt;
                count++;
            }
        }
        return mstCost;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        System.out.println(kruskal(edges, V));
    }
}
