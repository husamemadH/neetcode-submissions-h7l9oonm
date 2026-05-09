class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = profit;
        int min = 0;
        int l = 0 , r = 1;

        while(r < prices.length) {
            
            if(prices[r] < prices[l]) {
                l = r;
                max = 0;
            }

           
            profit = Math.max(prices[r] - prices[l] , profit);
            

           

             r++;
        }
 
       

        return profit;
    }
}
