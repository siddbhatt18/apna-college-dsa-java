public class BuySellStockWithFee {
    public static int[] stocksProfit(int prices[], int fee) {
        int n = prices.length;
        int hold[] = new int[n];
        int cash[] = new int[n];
        hold[0] = 0 - prices[0];
        cash[0] = 0;
        int totalProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        int lastBuyDay = 0;
        for(int i = 1; i < n; i++) {
            int currHold = cash[i - 1] - prices[i];
            if(currHold <= hold[i - 1]) {
                hold[i] = hold[i - 1];
            }
            else {
                hold[i] = currHold;
                lastBuyDay = i;
            }
            int currCash = hold[i - 1] + prices[i] - fee;
            if(currCash <= cash[i - 1]) {
                cash[i] = cash[i - 1];
            }
            else {  
                cash[i] = currCash;
                int currProfit = cash[i] - cash[i - 1];
                if(currProfit > totalProfit) {
                    totalProfit = currProfit;
                    buyDay = lastBuyDay;
                    sellDay = i;
                }
            }
        }
        int result[] = new int[2];
        result[0] = cash[n - 1];
        result[1] = sellDay - buyDay;
        return result;
    }
    public static void main(String[] args) {
        int prices[] = {6, 1, 7, 2, 8, 4};
        int fee = 2;
        int result[] = stocksProfit(prices, fee);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}