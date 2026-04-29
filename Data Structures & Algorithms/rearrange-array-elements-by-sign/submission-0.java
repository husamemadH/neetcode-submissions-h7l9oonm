class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int ansPtr = 0;
        int i = 0 , j = 0;

        while(i != nums.length && j != nums.length) {

                if(nums[i] > 0 && nums[j] < 0) {
                    ans[ansPtr++] = nums[i];
                    ans[ansPtr++] = nums[j];
                    i++;
                    j++;
                    continue;
                }

                if(nums[i] < 0) {
                    i++;
                }

                if(nums[j] > 0) {
                    j++;
                }
        }

        return ans;
    }
}