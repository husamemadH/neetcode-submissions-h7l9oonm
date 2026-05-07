class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0 , r = 0;
        int max = 0;
        int countZero = 0;
        
        while(r < nums.length) {
            
            if(nums[r] == 0) {
                countZero++;      
            }

            while(countZero == 2) {
                if (nums[l] == 0) {
                    countZero--;
                }
                l++;
            }
            int length = r - l + 1;
            max = Math.max(length , max);

            r++;
        }

        return max;
    }
}
