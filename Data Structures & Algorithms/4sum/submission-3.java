class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length - 1 ; i++) {
         
            for(int k = i + 1 ; k < nums.length ; k++ ) {
                   int j = nums.length - 1;

                    for(int d = k + 1 ; d < j ; ) {

                        long sum = (long)nums[i] + nums[k] + nums[j] + nums[d];

                        if(sum > target) {
                            j--;
                        }
                        else if ( sum < target ) {
                            d++;
                        }
                        else {
                            List<Integer> ans = Arrays.asList(nums[i] , nums[k] , nums[j] , nums[d]);
                            if(!list.contains(ans)) {
                                list.add(ans);
                            }
                            d++;
                            j--;
                        }

                    }
            }

        }

        return list;
    }
}