public class FloydWarshallAlgo {
    static int INF = 99999;
    public static void floydWarshall(int graph[][]) {
        int distance[][] = new int[graph.length][graph.length];
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph.length; j++) {
                distance[i][j] = graph[i][j];
            }
        }
        for(int k = 0; k < graph.length; k++) {
            for(int i = 0; i < graph.length; i++) {
                for(int j = 0; j < graph.length; j++) {
                    if(distance[i][k] != INF && distance[k][j] != INF && distance[i][k] + distance[k][j] < distance[i][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                    }
                }
            }
        }
        printMatrix(distance);
    }
    public static void printMatrix(int distance[][]) {
        for(int i = 0; i < distance.length; i++) {
            for(int j = 0; j < distance.length; j++) {
                if(distance[i][j] == INF) {
                    System.out.print("INF ");
                } 
                else {
                    System.out.print(distance[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int graph[][] = {{0, 5, INF, 10}, {INF, 0, 3, INF}, {INF, INF, 0, 1}, {INF, INF, INF, 0}};
        floydWarshall(graph);
    }
}