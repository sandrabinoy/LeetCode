class Solution {
    public int maxProfit(int[] prices) {
        
        int minVal = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            
            int curr = prices[i];
            if (curr < minVal) {
                minVal = curr;
            }
            
            profit = curr - minVal;
            if (profit > overallProfit) {
                overallProfit = profit;
            }
            
        }
        return overallProfit;
    }
}