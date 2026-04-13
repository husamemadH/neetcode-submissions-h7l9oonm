class Solution {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];

        for(int num : nums) {

            freq[num]++;
        }

        for(int num : freq) {
            System.out.print(num);
        }
        int j = 0;
        for(int i = 0 ; i < freq.length ; i++) {
            
            while(freq[i] > 0) {
                nums[j] = i;
                j++;
                freq[i]--;
            }
        }

        
    }
}