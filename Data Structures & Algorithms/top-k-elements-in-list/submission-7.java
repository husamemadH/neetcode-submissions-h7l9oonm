class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] frequent = new ArrayList[nums.length + 1];
        Map<Integer , Integer> freq = new HashMap<>();

        for(int i = 0 ; i < frequent.length ; i++) {
            frequent[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < nums.length ; i++) {

            freq.put(nums[i] , freq.getOrDefault(nums[i], 0) + 1);
        }

        freq.forEach((key , v) -> {
            frequent[v].add(key);
        });
        
        int[] res = new int[k];

        for(int i = frequent.length - 1 ; i >= 0 ; i--) {

            while(!frequent[i].isEmpty() && k > 0) {
                res[k - 1] = frequent[i].get(0);
                frequent[i].remove(0);
                k--;
            }

        }

        return res;
    }
}
