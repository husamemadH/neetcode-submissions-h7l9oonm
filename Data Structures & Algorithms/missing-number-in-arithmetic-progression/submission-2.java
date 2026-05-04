class Solution {
    public int missingNumber(int[] nums) {
        int gap = nums[1] - nums[0];

        for(int i = 0 ; i < nums.length - 2 ; i++) {
            if(nums[i + 1] - nums[i] != nums[i + 2] - nums[i + 1]) {
                return nums[i] + nums[i + 2] - nums[i + 1];
            }
        }

        return nums[0];
    }
}