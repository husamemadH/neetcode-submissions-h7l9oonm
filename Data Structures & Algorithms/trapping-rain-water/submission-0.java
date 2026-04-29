class Solution {
    public int trap(int[] height) {
        int max = 0;
        int ans = 0;
        int[] maxRight = new int[height.length];
        int[] maxLeft = new int[height.length];
       
        for(int i = 0 ; i < maxLeft.length ; i++) {
        
        maxLeft[i] = max;
        max = Math.max(height[i] , max);
         
        }

        max = 0;
        for(int i = maxRight.length - 1 ; i >= 0 ; i--) {
            maxRight[i] = max;
            max = Math.max(height[i] , max);
        }   

        for(int i = 0 ; i < height.length ; i++) {
            int sum  = Math.min(maxRight[i] , maxLeft[i]) - height[i];
            ans += sum > 0 ? sum : 0;
        }

           

           

            return ans;
    }
}
