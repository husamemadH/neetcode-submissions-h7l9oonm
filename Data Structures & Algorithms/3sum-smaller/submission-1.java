class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int ans = 0;

        int l = 0 , r = nums.length - 1;

        while(l < r) {
            r = nums.length - 1;
            int i = l + 1;

            while(i < r) {

                int sum = nums[i] + nums[r] + nums[l];

                if(sum < target) {
                    ans++;
                    
                }
                
                r--;

                if(i == r && i != nums.length - 1) {
                    r = nums.length - 1;
                    i++;
                    continue;
                } 

            }
            l++;
        }

        return ans;
    }
}
