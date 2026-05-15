class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int l = 0 , window = 0 , maxWindow  = 0 , satisfied = 0;
        int r = 0;

        while(r < customers.length) {

            if(grumpy[r] == 1) {
                window += customers[r];
            }
            else{
                satisfied += customers[r];
            }

            if(r - l + 1 > minutes) {
                if(grumpy[l] == 1) {
                    window -= customers[l];
                }
                 l++;
            }

            maxWindow = Math.max(maxWindow , window);

           
            r++;

        }

        return satisfied + maxWindow;
        
    }
}