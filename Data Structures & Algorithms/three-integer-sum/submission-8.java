class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 2 ; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k) {
                Long sum = Long.valueOf(nums[i] + nums[j] + nums[k]);

                if(sum == 0) {
                    List<Integer> triplet = new ArrayList();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    if(!ans.contains(triplet)) {
                        ans.add(triplet);
                    }
                    j++;
                }
                else if (sum > 0) {
                    k--;
                }
                else{
                    j++;
                }
                
            }
        } 

        return ans;
    }
}
