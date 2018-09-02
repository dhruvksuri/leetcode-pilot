class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) return 0;
        int sell = 0;
        int coolDown = 0;
        for(int i = 1; i < prices.length; i++){
            int tmp = sell;
            sell = Math.max(sell + prices[i] - prices[i-1], coolDown);
            coolDown = Math.max(tmp, coolDown);
        }
        return Math.max(sell, coolDown);
    }
}