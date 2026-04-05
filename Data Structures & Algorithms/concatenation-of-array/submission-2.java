class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        
        int where = nums.length;

        for(int i = 0 ; i < nums.length ; i++) {

            ans[i] = nums[i];
            ans[i + where] = nums[i];
        }

       

        return ans;
    }
}