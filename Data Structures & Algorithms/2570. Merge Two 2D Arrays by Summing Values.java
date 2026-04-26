class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> res = new ArrayList<>();

        int i = 0 , j = 0;
        while(i < nums1.length && j < nums2.length) {
            int id1 = nums1[i][0] , id2 = nums2[j][0];
            int val1 = nums1[i][1] , val2 = nums2[j][1];

            if(id1 == id2) {
                res.add(new int[]{id1 , val1+val2});
                i++;
                j++;
            }
            else if (id1 < id2) {
                res.add(new int[]{id1 , val1});
                i++;
            }
            else{
                res.add(new int[]{id2 , val2});
                j++;
            }
        } 
        while(i < nums1.length) { 
            res.add(nums1[i]); 
            i++;
        }
        while(j < nums2.length) {
            res.add(nums2[j]);
            j++;
        }
        // toArray must take in a typed array (type of the array and the size)
        return res.toArray(new int[res.size()][]);
    }
}
