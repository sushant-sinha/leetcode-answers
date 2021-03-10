// SUSHANT SINHA

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 ) return 0;
        int buyPrice = prices[0];
        int profit = 0;
        for (int cur : prices) {
            if (buyPrice < cur) {
                profit = profit > cur -buyPrice ? profit : cur - buyPrice;
            } else {
                buyPrice = cur;
            }
        }
        return profit;
    }
}