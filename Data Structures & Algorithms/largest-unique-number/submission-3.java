class Solution {
    public int largestUniqueNumber(int[] nums) {
        int max = -1;

        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {

            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
             
        }

       for(Map.Entry<Integer , Integer> entry : map.entrySet()) {

        int v = entry.getValue();
        int k = entry.getKey();

        if(k > max && v == 1) {
            max = k;
        }

       }

        return max;
    }
}
