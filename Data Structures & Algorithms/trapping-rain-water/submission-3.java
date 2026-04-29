class Solution {
    public int trap(int[] height) {
        int l = 0 , r = height.length - 1;
        int ans = 0;
        int maxLeft = height[l];
        int maxRight = height[r];
      
        while(l < r) {

            int cal = 0;

            if(maxLeft <= maxRight) {
                l++;
                cal = l;
            }
            
            else{
                r--;
                cal = r;
            }

            if(height[l] >= maxLeft) {

                maxLeft = height[l];
              
            }

            if(height[r] >= maxRight) {

                maxRight = height[r];
               
            }


            int sum = Math.min(maxLeft , maxRight) - height[cal];

            ans += sum > 0 ? sum : 0;
           

          
        }

        return ans;
    }
}
