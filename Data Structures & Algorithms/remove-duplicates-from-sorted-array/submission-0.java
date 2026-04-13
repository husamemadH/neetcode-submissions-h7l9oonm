class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        for(int r = 1 ; r < nums.length ;) {

            if(nums[l] == nums[r]) {

                r++;
            }
            else{
                l++;
                nums[l] = nums[r];
                
                r++;
            }
        }

        return l+1;
    }
}