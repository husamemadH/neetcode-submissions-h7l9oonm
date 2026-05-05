class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for(int num : piles) { 
            if(num > max) {
                max = num;
            }
        }
        int l = 1 , r = max;
        
        while(l <= r) {

            int mid = l + (r - l) / 2;
            int hours = 0;

            for(int i = 0 ; i < piles.length ; i++) {
                
                hours += Math.ceil((double)piles[i] / mid);
            }

            if(hours > h) {
                l = mid + 1;
            }
            else if(hours <= h) {
                r = mid - 1;
            }

        }

        
     
        return l;
    }
}
