class Solution {
    public int trap(int[] height) {
        int l = 0 , r = height.length - 1;
        int ans = 0;
        int maxLeft = height[l];
        int maxRight = height[r];
      
        while(l < r) {

            

            if(maxLeft <= maxRight) {
                l++;
                maxLeft = Math.max(height[l] , maxLeft);
                ans+= maxLeft - height[l];
                
            }
            
            else{
                r--;
                maxRight = Math.max(height[r] , maxRight);
                ans += maxRight - height[r];
            }

          
        }

        return ans;
    }
}
