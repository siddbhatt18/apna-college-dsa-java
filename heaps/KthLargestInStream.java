import java.util.*;
public class KthLargestInStream {
    public static ArrayList<Integer> getKthLargestElement(int stream[], int k) {
        PriorityQueue<Integer> pque = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < stream.length; i++) {
            int num = stream[i];
            if(pque.size() < k) {
                pque.add(num);
            } 
            else if(num > pque.peek()) {
                pque.remove();
                pque.add(num);
            }
            if(pque.size() == k) {
                result.add(pque.peek());
            }
            else {
                result.add(null);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int stream[] = {10, 20, 11, 70, 50, 40, 100, 5};
        int k = 3;
        ArrayList<Integer> result = getKthLargestElement(stream, k);
        for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}