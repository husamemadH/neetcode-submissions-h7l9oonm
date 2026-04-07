class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0 , j = 1 ; j < s.length() ; j++ , i++) {

            sum += Math.abs(s.charAt(j) - s.charAt(i));

        }

        return sum;
    }
}