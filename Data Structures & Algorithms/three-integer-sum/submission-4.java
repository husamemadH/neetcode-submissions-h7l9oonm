class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        

        for(int i = 0 ; i < nums.length - 1 ; i++) {
           int j = nums.length - 1;

            for(int k = i + 1 ; k < j ; ) {
                int sum = nums[i] + nums[k] + nums[j];

                if(sum > 0 ) {
                    j--;
                }
                else if (sum < 0) {
                    k++;
                }
                else{
                    List<Integer> triplet = Arrays.asList(nums[i] , nums[k] , nums[j]);
                    if(!list.contains(triplet))
                    list.add(triplet);
                    k++;
                }

            }


        }
        return list;
    }
}
