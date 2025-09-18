import java.util.*;
public class UnionIntersection {
    public static int numberOfUnion(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        return hs.size();
    }
    public static int numberOfIntersection(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i <arr1.length; i++) {
            hs.add(arr1[i]);
        }
        int count = 0;
        for(int i = 0; i < arr2.length; i++) {
            if(hs.contains(arr2[i])) {
                count++;
                hs.remove(arr2[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println(numberOfUnion(arr1, arr2));
        System.out.println(numberOfIntersection(arr1, arr2));
    }
}