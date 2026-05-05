class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int l = 0 , r = nums.length - 1;

        while(l < r){

            int mid = l + (r - l) / 2;
            System.out.println(mid);

            if(nums[mid + 1] != nums[mid] && nums[mid - 1] != nums[mid]) {
                return nums[mid];
            }
            if(mid % 2 == 0) {
                if(nums[mid] != nums[mid + 1]) {
                    r = mid - 1;
                }
                else{
                     l = mid + 1;
                }

            }
            else{
                    if(nums[mid] != nums[mid - 1]) {

                        r = mid - 1;
                    }
                    else{

                        l = mid + 1;
                    }
            }
        }
        return nums[l];
    }
}