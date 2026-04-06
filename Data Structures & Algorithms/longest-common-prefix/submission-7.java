class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstString = strs[0];

        for(int i = 0 ; i < firstString.length() ; i++) {

            for(String s : strs) {

                if(i == s.length() || s.charAt(i) != firstString.charAt(i)) {
                    return s.substring(0 , i);
                }

            }

        }

        return firstString;
    }
}