import java.util.*;
public class MinSumOfDifference {
    public static int minAbsoluteDifference(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int minDifference = 0;
        for(int i = 0; i < arr1.length; i++) {
            minDifference = minDifference + Math.abs(arr1[i] - arr2[i]);
        }
        return minDifference;
    }
    public static void main(String[] args) {
        int arr1[] = {4, 1, 8, 7};
        int arr2[] = {2, 3, 6, 5};
        System.out.println(minAbsoluteDifference(arr1, arr2));
    }
}