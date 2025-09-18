import java.util.*;
public class FinishTasks {
    public static class Edge {
        int src;
        int dst;
        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int order[][]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < order.length; i++) {
            int task = order[i][0];
            int prereq = order[i][1];
            graph[prereq].add(new Edge(prereq, task));
        }
    }
    public static boolean finishTasks(int order[][], int n) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, order);
        int indegree[] = new int[n];
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int nhbr = e.dst;
                indegree[nhbr]++;
            }
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < graph.length; i++) {
            if(indegree[i] == 0) {
                que.add(i);
            }
        }
        int count = 0;
        while(que.isEmpty() != true) {
            int curr = que.remove();
            count++;
            for(int j = 0; j < graph[curr].size(); j++) {
                Edge e = graph[curr].get(j);
                int nhbr = e.dst;
                indegree[nhbr]--;
                if(indegree[nhbr] == 0) {
                    que.add(nhbr);
                }
            }
        }
        if(count == n) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int order[][] = {{1, 0}, {2, 1}, {3, 2}};    
        System.out.println(finishTasks(order, n));
    }
}