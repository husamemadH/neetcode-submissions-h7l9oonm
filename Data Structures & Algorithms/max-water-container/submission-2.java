class Solution {
    public int maxArea(int[] heights) {
        int maxWater= 0;

        int l = 0;
        int r = heights.length - 1;

        while(l < r) {
            int minCol = Math.min(heights[l] , heights[r]);
            int water = minCol * (r - l);

            if(water > maxWater) {
                maxWater = water;
            }

            if(heights[r] == minCol) {
                r--;
            }

            if(heights[l] == minCol) {
                l++;
            }
        }

        return maxWater;
    }
}
