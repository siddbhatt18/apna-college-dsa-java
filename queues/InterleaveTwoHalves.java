import java.util.*;
public class InterleaveTwoHalves {
    public static void interleaveQueue(Queue<Integer> fullQueue) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = fullQueue.size();
        for(int i = 0; i < size / 2; i++) {
            int val = fullQueue.remove();
            firstHalf.add(val);
        }
        while(firstHalf.isEmpty() != true) {
            int firstHalfNum = firstHalf.remove();
            fullQueue.add(firstHalfNum);
            int secondHalfNum = fullQueue.remove();
            fullQueue.add(secondHalfNum);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> fullQueue = new LinkedList<>();
        for(int i = 1; i <= 10; i++) {
            fullQueue.add(i);
        }
        interleaveQueue(fullQueue);
        while(fullQueue.isEmpty() != true) {
            System.out.print(fullQueue.remove() + " ");
        }
    }
}