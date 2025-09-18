public class PrintKeyPosition {
    public static void findKeyPosition(int index, int key, int arr[]) {
        if(index == arr.length) {
            return;
        }
        if(key == arr[index]) {
            System.out.print(index + " ");
        }
        findKeyPosition(index + 1, key, arr);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        findKeyPosition(0, key, arr);
    }
}