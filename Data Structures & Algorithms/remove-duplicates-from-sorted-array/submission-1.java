class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 1;
        for(int r = 1 ; r < nums.length ;) {

           if(nums[r] == nums[r - 1]) {
            r++;
           }
           else{
            nums[l] = nums[r];
            l++;
            r++;
           }
        }

        return l;
    }
}