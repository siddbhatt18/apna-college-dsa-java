public class BuyAndSellStocks {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            int currPrice = prices[i];
            if(currPrice > buyPrice) {
                int profit = currPrice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else {
                buyPrice = currPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}