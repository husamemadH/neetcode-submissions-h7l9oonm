class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int ans = 0;
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i + 1 ; j < nums.length ; j++) {
                    if(nums[j] == nums[i])
                        ans++;
            }
        }
        return ans;
    }
}