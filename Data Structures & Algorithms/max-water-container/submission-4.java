class Solution {
    public int maxArea(int[] heights) {

        int l = 0 ,  r = heights.length - 1;

        int res = 0;

        while(l < r) {
        
        int minHeight = Math.min(heights[r] , heights[l]);
        
        res = Math.max(res , minHeight * (r - l));

        if(heights[r] > heights[l]) {
            l++;
        }
        else{
            r--;
        }
        

        }       

        return res;
    }
}
