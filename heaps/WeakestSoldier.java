import java.util.*;
public class WeakestSoldier {
    public static class Row implements Comparable<Row> {
        int soldiers;
        int idx;
        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row other) {
            if(this.soldiers == other.soldiers) {
                return this.idx - other.idx;
            }
            else {
                return this.soldiers - other.soldiers;
            }
        }
    }
    public static void printRowOfWeakestSoldier(int army[][], int k) {
        PriorityQueue<Row> pque = new PriorityQueue<>();
        for(int i = 0; i < army.length; i++) {
            int countSoldiers = 0;
            for(int j = 0; j < army[0].length; j++) {
                if(army[i][j] == 1) {
                    countSoldiers++;
                }
            }
            pque.add(new Row(countSoldiers, i));
        }
        for(int i = 0; i < k; i++) {
            System.out.println("Row " + pque.peek().idx);
            pque.remove();
        }
    }
    public static void main(String[] args) {
        int army[][] = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int k = 2;
        printRowOfWeakestSoldier(army, k);
    }
}