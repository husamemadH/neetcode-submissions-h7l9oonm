class Solution {
    public int majorityElement(int[] nums) {
         int canidate = nums[0];
        int count = 1;

        for(int i = 1 ; i < nums.length ; i++) {

            if(nums[i] == canidate) {
                count++;
            }
            else{
                count--;
                if(count == 0) {canidate = nums[i];
                count = 1; }
            }
        }

        return canidate;
    }
}