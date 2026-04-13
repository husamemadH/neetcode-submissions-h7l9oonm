class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer , Integer> map = new HashMap<>();
       ArrayList<Integer>[] arr = (ArrayList<Integer>[]) new ArrayList[nums.length + 1];

        

        for(int num : nums) {

            map.put(num , map.getOrDefault(num, 0) + 1);
        }

 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
               
                if(arr[entry.getValue()] == null) {

                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(entry.getKey());  
                    arr[entry.getValue()] = list;
                } 
                else{
                    arr[entry.getValue()].add(entry.getKey());
                }
}
            int[] result  = new int[k];
            int index = 0;
           for(int i = arr.length - 1 ; i > 0 ; i--) {
                if(arr[i] == null) {
                    continue;
                }
                while(!arr[i].isEmpty() && index < result.length) {
                   
                    result[index] = arr[i].remove(0);
                     index++;

                }
           }

           return result; 

    }
}
