public class UndirectedGraphCycleUF {
    static int n = 7;
    static int parent[] = new int[n];
    static int rank[] = new int[n];
    public static void init() {
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }
    public static int find(int x) {
        if(x != parent[x]) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
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
    public static boolean findCycle(int edges[][]) {
        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int parentU = find(u);
            int parentV = find(v);
            if(parentU == parentV) {
                return true;
            }
            else {
                union(u, v);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        init();
        int edges[][] = {{0,1}, {1,2}, {2,3}, {3,0}};
        System.out.println(findCycle(edges));
    }
}