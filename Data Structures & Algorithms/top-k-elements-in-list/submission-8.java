class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] freqArray = new ArrayList[nums.length + 1];
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < freqArray.length ; i++) {
            freqArray[i] = new ArrayList<>();
        }

        for(int num : nums) {
            map.put(num , map.getOrDefault(num, 0) + 1);
        }

        map.forEach((key, v) -> {
            freqArray[v].add(key);
        });

        int[] ans = new int[k];
        for(int i = freqArray.length - 1 ; i >= 0 ; i--) {
            
            while(!freqArray[i].isEmpty() && k > 0) {
                
                ans[k - 1] = freqArray[i].remove(0);
                k--;

            }


        }


        return ans;






    }
}
