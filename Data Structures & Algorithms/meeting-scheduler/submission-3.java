class Solution {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(slots1, (a , b) -> a[0] - b[0]);
        Arrays.sort(slots2, (a , b) -> a[0] - b[0]);
        for(int i = 0 ; i < slots1.length ; i++) {

            for(int j = 0 ; j < slots2.length ; j++) {
                
                int start = Math.max(slots1[i][0] , slots2[j][0]);
                int end = Math.min(slots1[i][1] , slots2[j][1]);

                if(end +- start >= duration) {
                    ans.add(start);
                    ans.add(start + duration);
                    return ans;
                }
                
            }
        }

    
    return ans;
        
    }
}
