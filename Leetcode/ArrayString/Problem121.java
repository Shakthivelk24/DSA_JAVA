class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int buyerPrices = prices[0];
        for(int i=1;i<n;i++){
            int curProfit = prices[i] - buyerPrices; 
            if(curProfit > maxProfit){
                maxProfit = curProfit;
            }
            if(prices[i] < buyerPrices){
                buyerPrices = prices[i];
            }
        }
        return maxProfit;
    }
}