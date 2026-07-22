class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i])
                buy=prices[i];
            else {
                max=Math.max(max, prices[i]-buy);
            }
        }
        return max;
    }
}
