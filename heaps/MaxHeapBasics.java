import java.util.*;
public class MaxHeapBasics {
    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();
        private void swap(int idx1, int idx2) {
            int temp = arr.get(idx1);
            arr.set(idx1, arr.get(idx2));
            arr.set(idx2, temp);
        }
        public void add(int data) {
            arr.add(data);
            int childIdx = arr.size() - 1;
            int parentIdx = (childIdx - 1) / 2;
            while(childIdx > 0 && arr.get(childIdx) > arr.get(parentIdx)) {
                swap(childIdx, parentIdx);
                childIdx = parentIdx;
                parentIdx = (childIdx - 1) / 2;
            }
        }
        public int peek() {
            return arr.get(0);
        }
        public int remove() {
            int data = arr.get(0);
            swap(0, arr.size() - 1);
            arr.remove(arr.size() - 1);
            heapify(0);
            return data;
        }
        private void heapify(int parentIdx) {
            int leftChildIdx = 2 * parentIdx + 1;
            int rightChildIdx = 2 * parentIdx + 2;
            int maxIdx = parentIdx;
            if(leftChildIdx < arr.size() && arr.get(leftChildIdx) > arr.get(maxIdx)) {
                maxIdx = leftChildIdx;
            }
            if(rightChildIdx < arr.size() && arr.get(rightChildIdx) > arr.get(maxIdx)) {
                maxIdx = rightChildIdx;
            }
            if(maxIdx != parentIdx) {
                swap(maxIdx, parentIdx);
                heapify(maxIdx);
            }
        }
        public boolean isEmpty() {
            if(arr.size() == 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(3);
        hp.add(4);
        hp.add(1);
        hp.add(5);
        while(hp.isEmpty() != true) {
            System.out.print(hp.peek() + " ");
            hp.remove();
        }
    }
}