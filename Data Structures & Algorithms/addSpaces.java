class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int i = 0 , j = 0;

        while(i < spaces.length) {

            while(j < spaces[i]) {
                ans.append(s.charAt(j));
                j++;
            }
           
            ans.append(" ");
            i++;

        }

        while(j < s.length()) {
            ans.append(s.charAt(j++));
        }

        return ans.toString();
    }
}
