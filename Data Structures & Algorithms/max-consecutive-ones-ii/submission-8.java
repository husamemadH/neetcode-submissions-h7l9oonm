class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0 , r = 0;
        int max = 0;
        int countZero = 0;
        if(nums.length == 1) {
            return 1;
        }
        while(r < nums.length) {
            
            if(nums[r] == 0) {
                countZero++;      
            }

            if(countZero > 1) {
                l = r;
                countZero = 1;
            }
            int length = r - l + 1;
            max = Math.max(length , max);

            r++;
        }

        return max;
    }
}
