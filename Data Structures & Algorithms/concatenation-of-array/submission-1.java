class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        
        for(int i = 0  , j = 0; i < ans.length ; i++ , j++) {
            if(j == nums.length) {
                j = 0;
            }
            
            ans[i] = nums[j];
        }

       

        return ans;
    }
}