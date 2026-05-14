class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0 , r = k - 1;
        int currSum = 0;
        int res =0 ;

        for(int i = 0 ; i < r ; i++) {

            currSum+=arr[i];
        }

        while(r < arr.length) {
            
            currSum += arr[r];

            int avg = currSum / (r - l + 1);

            if(avg >= threshold) {
                res++;
            }
            currSum -= arr[l];
            r++;
            l++;
        }

        return res;
    }
}