class Solution {
    public int majorityElement(int[] nums) {
        int major = nums.length / 2;
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {

                map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);

                if(map.get(nums[i]) > major) {
                    return nums[i];
                }
        }

    return 0;
    }
}