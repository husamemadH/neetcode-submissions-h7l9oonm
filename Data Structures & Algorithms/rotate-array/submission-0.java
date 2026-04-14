class Solution {
    public void rotate(int[] nums, int k) {
       int[] dum = new int[nums.length];

       for(int i = 0 ; i < nums.length ; i++) {
         dum[(i + k) % nums.length] = nums[i];
       } 

       System.arraycopy(dum , 0 , nums , 0 , nums.length);

       
    }
}