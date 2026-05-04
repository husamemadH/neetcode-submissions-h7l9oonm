class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num , map.getOrDefault(num , 0 ) + 1);
        }
        int canidate = nums[0];
        int count = 1;

        for(int i = 1 ; i < nums.length ; i++) {

            if(nums[i] == canidate) {
                count++;
            }
            else{
                count--;
                if(count == 0)  {canidate = nums[i];
                count = 1;
                } 
            }
        }

        return canidate == target && map.get(canidate) >  nums.length / 2;
    }
}
