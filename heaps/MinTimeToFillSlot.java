import java.util.*;
public class MinTimeToFillSlot {
    public static int findMinTime(int arr[], int n, int k) {
        boolean visited[] = new boolean[n + 1];
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
            int slot = arr[i];
            que.add(slot);
            visited[slot] = true;
        }
        int time = 0;
        while(que.isEmpty() != true) {
            int currSize = que.size();
            for(int i = 0; i < currSize; i++) {
                int curr = que.remove();
                if(curr - 1 >= 1 && visited[curr - 1] == false) {
                    que.add(curr - 1);
                    visited[curr - 1] = true;
                }
                if(curr + 1 <= n && visited[curr + 1] == false) {
                    que.add(curr + 1);
                    visited[curr + 1] = true;
                }
            }
            time++;
        }
        return time - 1;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4};
        int n = 8; 
        int k = 2;
        System.out.println(findMinTime(arr, n, k));
    }
}