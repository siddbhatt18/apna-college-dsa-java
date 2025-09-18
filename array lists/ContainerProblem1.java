import java.util.*;
public class ContainerProblem1 {
    public static int findMaxWaterCollected(ArrayList<Integer> list) {
        int maxWater = 0;
        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = i + 1; j < list.size(); j++) {
                int currWater = Math.min(list.get(i), list.get(j)) * (j - i);
                maxWater = Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(findMaxWaterCollected(list));
    }
}
