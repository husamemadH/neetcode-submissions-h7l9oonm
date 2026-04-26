class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0 , j = nums.length - 1;

        int maxSum = -1;
        while(i < j) {

            int sum = nums[i] + nums[j];
            if(sum >= k) {
                j--;
            }
            else {

                maxSum = Math.max(maxSum , sum);
                i++;
            } 
            
        }

        return maxSum;
    }
}
