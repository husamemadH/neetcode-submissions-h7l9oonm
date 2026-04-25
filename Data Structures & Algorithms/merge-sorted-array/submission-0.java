class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k =  m - 1;
        int j = n - 1;
        int i = nums1.length - 1; 
        for(; i >= 0 ; i--) {
                if(k < 0 || j < 0)
                break;

                if(nums2[j] < nums1[k]) {
                    nums1[i] = nums1[k];
                    k--;
                }
                else{
                        nums1[i] = nums2[j];
                        j--;
                }
        }

        while(j >= 0) {
            nums1[i] = nums2[j];
            j--;
            i--; 
        }

        while(k >= 0) {
            nums1[i] = nums1[k];
            i--;
            k--;
        }
    }
}