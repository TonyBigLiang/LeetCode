package dynamic_programming;

/**
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * created by liangqun on 2019/8/21
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxprofit) {
                maxprofit = prices[i] - minPrice;
            }
        }
        return maxprofit;
    }
}
