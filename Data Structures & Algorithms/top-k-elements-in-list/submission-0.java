class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map  = new HashMap<>();
       ArrayList<Integer>[] bucket = (ArrayList<Integer>[]) new ArrayList[nums.length + 1];

// Option B: Initializing each bucket (Crucial Step)
for (int i = 0; i < bucket.length; i++) {
    bucket[i] = new ArrayList<>();
}

        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);
        }

        map.forEach((key, v) -> bucket[v].add(key));



    int[] ans = new int[k];

    for(int i = bucket.length - 1; i >= 0 ; i--) {
        if(k == 0) {
            break;
        }
        while(!bucket[i].isEmpty()) {
                int size = bucket[i].size() - 1;
                ans[k - 1] = bucket[i].remove(size);
                size--;
                k--;
            
        }
        
    }

    return ans;
    }
}
