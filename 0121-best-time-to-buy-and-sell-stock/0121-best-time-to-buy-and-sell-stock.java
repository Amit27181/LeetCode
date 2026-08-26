class Solution {
    public int maxProfit(int[] prices) {
        int price=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-price;
            maxprofit=Math.max(profit,maxprofit);
            price=Math.min(price,prices[i]);
        }
        return maxprofit;
    }
}
