class Solution {
    public int minimumRecolors(String blocks, int k) {

        int l = 0 , r = 0;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        int  count = 0;

        while(r < blocks.length()) {

                 if(r - l + 1 > k) {

                    if(blocks.charAt(l) == 'W') {
                            sum--;
                    }
                        l++;
                 }

                 if(blocks.charAt(r) == 'W') {
                    sum++;
                 }

                if(r + 1 >= k)
                minSum = Math.min(minSum , sum);

                r++;
        }

        return minSum;
    }
}