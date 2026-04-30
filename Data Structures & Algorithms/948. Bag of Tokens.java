class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int score = 0;
        int l = 0 , r = tokens.length - 1;

        while(l <= r) {

            if(tokens[l] <= power) {
                power -= tokens[l];
                score++;
                l++;
            }
            else{
                if(r == l || score == 0) {
                  
                break;
               
                }
                power+= tokens[r];
                score--;
                r--;
            }

        }

        return score;
    }
}
