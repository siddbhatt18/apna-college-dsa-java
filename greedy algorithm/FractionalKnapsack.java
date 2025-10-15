import java.util.*;
public class FractionalKnapsack {
    public static double fractionalKnapsack(int value[], int weight[], int capacity) {
        double ratio[][] = new double[value.length][2];
        for(int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double)value[i] / weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        double finalValue = 0;
        for(int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            double ratioValue = ratio[i][1];
            if(weight[idx] <= capacity) {
                finalValue = finalValue + value[idx];
                capacity = capacity - weight[idx]; 
            }
            else {
                finalValue = finalValue + (ratioValue * capacity);
                capacity = 0;
                break;
            }
        }
        return finalValue;
    }
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int capacity = 50;
        System.out.println(fractionalKnapsack(value, weight, capacity));
    }
}