import java.util.*;
public class AlienDictionary {
    public static class Edge {
        int src;
        int dst;
        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], String dict[], int N) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < N - 1; i++) {
            String str1 = dict[i];
            String str2 = dict[i + 1];
            int minLen = Math.min(str1.length(), str2.length());
            for(int j = 0; j < minLen; j++) {
                if(str1.charAt(j) != str2.charAt(j)) {
                    int u = str1.charAt(j) - 'a';
                    int v = str2.charAt(j) - 'a';
                    graph[u].add(new Edge(u, v));
                    break;
                }
            }
        }
    }
    public static String findOrder(ArrayList<Edge> graph[], int K) {
        int indegree[] = new int[K];
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int nhbr = e.dst;
                indegree[nhbr]++;
            }
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < K; i++) {
            if(indegree[i] == 0) {
                que.add(i);
            }
        }
        StringBuilder order = new StringBuilder();
        while(que.isEmpty() != true) {
            int curr = que.remove();
            order.append((char)(curr + 'a'));
            for(int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                int nhbr = e.dst;
                indegree[nhbr]--;
                if(indegree[nhbr] == 0) {
                    que.add(nhbr);
                }
            }
        }
        if(order.length() != K) {
            return "invalid";
        }
        else {
            return order.toString();
        }
    }
    public static void main(String[] args) {
        int N = 5;
        int K = 4;
        String dict[] = {"baa", "abcd", "abca", "cab", "cad"};
        ArrayList<Edge> graph[] = new ArrayList[K];
        createGraph(graph, dict, N);
        System.out.println(findOrder(graph, K));
    }
}