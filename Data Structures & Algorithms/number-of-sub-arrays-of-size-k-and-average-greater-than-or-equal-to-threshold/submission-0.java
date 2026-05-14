class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0 , r = k - 1;
        int res =0 ;
        while(r < arr.length) {
            int sum = 0;

            for(int j = l ; j <= r ; j++) {
                sum += arr[j];
            }

            int avg = sum / (r - l + 1);

            if(avg >= threshold) {
                res++;
            }
            r++;
            l++;
        }

        return res;
    }
}