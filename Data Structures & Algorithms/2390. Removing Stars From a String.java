class Solution {
    public String removeStars(String s) {
        
        StringBuilder ans = new StringBuilder();

        for(Character c : s.toCharArray()) {

            if(c == '*') {
                ans.deleteCharAt(ans.length() - 1);
            }
            else{
                ans.append(c);
            }
        }
           

            return ans.toString();
    }
}
