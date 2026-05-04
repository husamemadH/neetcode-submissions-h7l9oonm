class Solution {
    public int missingElement(int[] nums, int k) {
        
        for(int i = 0 ; i < nums.length - 1 ; i++) {

            int missedGap = nums[i + 1] - nums[i] - 1;

            if(missedGap >= k) {
                return nums[i] + k;
            }
            else{
                k -= missedGap;
            }
        }

        return nums[nums.length - 1] + k;
    }
}
