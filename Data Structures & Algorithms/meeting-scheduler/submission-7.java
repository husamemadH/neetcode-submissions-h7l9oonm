class Solution {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(slots1, (a , b) -> a[0] - b[0]);
        Arrays.sort(slots2, (a , b) -> a[0] - b[0]);
        
        int i = 0;
        int j = 0;

        while(i != slots1.length && j != slots2.length) {
            if(slots1[i][1] < slots2[j][0]) {
                i++;
            }
            else 
            if(slots1[i][0] > slots2[j][1]) {
                j++;
            }
            else{
                int end1 = slots1[i][1];
                int end2 =slots2[j][1];
            int start = Math.max(slots1[i][0] , slots2[j][0]);
            int end = Math.min(end1 , end2 );

            if(end - start >= duration) {
                ans.add(start);
                ans.add(start + duration);
                return ans;
            }
            if(end1 < end2)
            i++;
            else{
                j++;
            }
            }
        }

    
    return ans;
        
    }
}
