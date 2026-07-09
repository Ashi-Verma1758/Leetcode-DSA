class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lowest = prices[0];
        for(int price : prices){
            lowest = Math.min(price, lowest);
            max = Math.max(max, price-lowest);
        }
        return max;
    }
}