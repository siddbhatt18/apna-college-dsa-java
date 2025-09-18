import java.util.*;
public class CountDistinct {
    public static int countDistinct(int num[]) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i < num.length; i++) {
            hs.add(num[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        System.out.println(countDistinct(num));
    }
}