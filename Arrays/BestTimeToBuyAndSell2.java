class Solution {
    public int maxProfit(int[] prices) {
        // Improved Valley Approach method. Whenever we see an increase in prices, we buy the dip and sell on the increase.
        
        
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < prices.length; i++) 
        {
          // Checking for lower buy value
          if (buy > prices[i])
            buy = prices[i];

          // Checking for higher profit
          else
            max_profit += prices[i] - buy;
          buy = prices[i];
        }
        return max_profit;
    }
}