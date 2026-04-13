class Solution {

    boolean isPalindrome(int l , int r , String str) {

        while(l < r) {

            if(str.charAt(l) != str.charAt(r)) {
                    return false;
            }
            l++;
            r--;

        }

        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while(l < r) {

            if(s.charAt(l) != s.charAt(r)) {
                return isPalindrome(l+1 , r , s) || isPalindrome(l , r-1 , s);
            }
            l++;
            r--;
        } 

    return true;
    }
}