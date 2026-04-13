class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        

        for(int i = 0 , j = nums.length - 1;  i < j ; i++ ) {
         j = nums.length - 1;
        for(int k = i + 1 ; k < j ;) { 
            int sum = nums[i] + nums[k] + nums[j];
            
            if(sum > 0) {
                j--;
            }
            else if(sum < 0) {
                
                k++;
            }
            else{
                List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[k]);
                triplet.add(nums[j]);
                if(!list.contains(triplet)) {
                list.add(triplet);
                }
                k++;
                
            }
            }
            
        }
        return list;
    }
}
