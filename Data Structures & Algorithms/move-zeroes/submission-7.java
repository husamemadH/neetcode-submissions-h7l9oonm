class Solution {
    public void moveZeroes(int[] nums) {

         int i = 0;
        int k = 0;

        while(i < nums.length && nums[i] != 0) {
            i++;
            k++;
        }
        
         

        for( ; i < nums.length ; i++) {

            if(nums[i] != 0 && i != 0) {
               nums[k] = nums[i];
               nums[i] = 0;
               k++;     
            }
        }
    }
}