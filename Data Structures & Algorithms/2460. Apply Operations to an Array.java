class Solution {
    public int[] applyOperations(int[] nums) {
        int i = 0;
        
        while(i < nums.length - 1) {
            if(nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            i++;
        }

        int l = 0 , r = 0;

        while(r < nums.length) {

            if(nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }
            else{
                r++;
            }

        }

        return nums;
     
    }
}
