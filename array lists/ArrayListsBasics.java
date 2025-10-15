import java.util.*;
public class ArrayListsBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add(0, 40);
        System.out.println(list);
        list.set(1, 50);
        System.out.println(list);
        boolean result = list.contains(30);
        System.out.println(result);
        int val = list.get(1);
        System.out.println(val);
        int len = list.size();
        System.out.println(len);
    }
}