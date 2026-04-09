class Solution {
    public void sortColors(int[] nums) {

        int[] counts = {0 , 0, 0};
        
        for(int number : nums) {
            counts[number]++;
        }
        
    
        for(int i = 0 , j = 0  ; i < counts.length ; i++) {

            int counter = counts[i];

            while(counter > 0) {
                nums[j] = i;
                j++;
                counter--;
            }
        }


    }
}