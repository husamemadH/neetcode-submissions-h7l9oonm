class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int lastIndex = ans.length - 1;
        int i = lastIndex;
        int j = 0;

        while(j <= i)  {
           int sqrtI = nums[i] * nums[i];
            int sqrtJ = nums[j] * nums[j];

            if(sqrtI > sqrtJ) {
                ans[lastIndex] = sqrtI;
                i--;
                
            }
            else{
                ans[lastIndex] = sqrtJ;
                j++;
            }
            
            lastIndex--;
        }

        return ans;

    }
}