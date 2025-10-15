import java.util.*;
public class BeautifulArrayList {
    public static ArrayList<Integer> beautifulArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        while(list.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < list.size(); i++) {
                int num = list.get(i);
                int evenNum = num * 2;
                if(evenNum <= n) {
                    temp.add(evenNum);
                }
            }
            for(int j = 0; j < list.size(); j++) {
                int num = list.get(j);
                int oddNum = num * 2 - 1;
                if(oddNum <= n) {
                    temp.add(oddNum);
                }
            }
            list = temp;
        }
        return list;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(beautifulArrayList(n));
    }
}