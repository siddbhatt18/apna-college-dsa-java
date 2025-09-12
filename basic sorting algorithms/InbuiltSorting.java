import java.util.*;
public class InbuiltSorting {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Integer num[] = {5, 4, 1, 2, 3};
        Arrays.sort(num, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}