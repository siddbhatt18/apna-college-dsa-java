import java.util.*;
public class IndianCoins {
    public static ArrayList<Integer> numberOfCoins(Integer coins[], int amount) {
        Arrays.sort(coins, Collections.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < coins.length; i++) {
            while(coins[i] <= amount) {
                ans.add(coins[i]);
                amount = amount - coins[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int amount = 590;
        ArrayList<Integer> result = numberOfCoins(coins, amount);
        for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}