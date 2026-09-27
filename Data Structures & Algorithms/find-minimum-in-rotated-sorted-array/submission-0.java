class Solution {
    public int findMin(int[] nums) {

        int l = 0 , r = nums.length - 1;
        int ans = 0;

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(nums[mid] < nums[r]) {
                ans = nums[mid];
                r = mid;
            }
            else{
                ans = nums[r];
                l = mid + 1;
            }
        }


        return ans;


    }
}
