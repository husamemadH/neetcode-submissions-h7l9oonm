class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    
        int counter = 0;
        int max = 0;

        for(int num : nums ) {

            if(num == 0) {
                counter = 0;
            }
            else{
                counter++;
                max = Math.max(max , counter);
            }
        }

        return max;
    }
}