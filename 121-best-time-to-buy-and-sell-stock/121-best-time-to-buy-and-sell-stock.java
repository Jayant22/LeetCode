class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)  return 0;
        
        int maxProfit = 0, minStock = prices[0];
        
        for(int i=0; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - minStock);
            minStock = Math.min(minStock, prices[i]);
        }
        
        return maxProfit;
    }
}