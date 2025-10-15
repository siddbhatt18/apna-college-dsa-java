public class HeapSort {
    public static void swap(int arr[], int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void heapSort(int arr[]) {
        int size = arr.length;
        for(int i = size / 2; i >= 0; i--) {
            heapify(arr, i, size);
        }
        for(int i = size - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }
    public static void heapify(int arr[], int idx, int size) {
        int leftIdx = 2 * idx + 1;
        int rightIdx = 2 * idx + 2;
        int maxIdx = idx;
        if(leftIdx < size && arr[leftIdx] > arr[maxIdx]) {
            maxIdx = leftIdx;
        }
        if(rightIdx < size && arr[rightIdx] > arr[maxIdx]) {
            maxIdx = rightIdx;
        }
        if(maxIdx != idx) {
            swap(arr, maxIdx, idx);
            heapify(arr, maxIdx, idx);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}