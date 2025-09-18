    public class FirstOccurence {
        public static int findElement(int arr[], int key, int i) {
            if(i == arr.length) {
                return -1;
            }
            if(arr[i] == key) {
                return i;
            }
            return findElement(arr, key, i + 1);
        }
        public static void main(String[] args) {
            int arr[] = {2, 4, 6, 8, 2, 4, 6, 8};
            int key = 6;
            System.out.println(findElement(arr, key, 0));
        }
    }