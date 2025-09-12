public class CountingSort2 {
    public static void countingSortReverse(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int pos = 0;
        for(int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[pos] = i;
                pos++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSortReverse(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}