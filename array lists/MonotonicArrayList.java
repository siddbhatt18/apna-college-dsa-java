import java.util.*;
public class MonotonicArrayList {
    public static boolean findMonotonic(ArrayList<Integer> list) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) > list.get(i + 1)) {
                isIncreasing = false;
            }
            if(list.get(i) < list.get(i + 1)) {
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(findMonotonic(list));
    }
}