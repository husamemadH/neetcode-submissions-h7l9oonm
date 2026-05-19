class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        Map<Integer , Integer> freq = new HashMap<>();

        for(int i = 0 ; i < bucket.length ; i++) {
            bucket[i] = new ArrayList();
        }

        for(int num : nums) {
            freq.put(num , freq.getOrDefault(num, 0) + 1);
        }

        freq.forEach((key , value) -> {
            
            bucket[value].add(key);

        });

        int[] res = new int[k];
        for(int i = bucket.length - 1 ; i >= 0 ; i--) {

            
            
            while(!bucket[i].isEmpty() && k > 0) {

                res[k - 1] = bucket[i].remove(0);
                k--;
              
            }
        }

        return res;

    }
}
