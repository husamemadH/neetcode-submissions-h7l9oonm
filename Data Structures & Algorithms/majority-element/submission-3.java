class Solution {
    public int majorityElement(int[] nums) {
        
        int counter = 0;
        int canidate = 0;
        for(int num : nums) {
            if(counter == 0) {
                canidate = num;
            }
            if(num == canidate) {
                counter++;
            }
            else {
                counter--;
            }

            
        }
        return canidate;
    }
}