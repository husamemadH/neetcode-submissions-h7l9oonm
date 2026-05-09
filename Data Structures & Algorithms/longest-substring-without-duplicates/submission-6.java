class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0 , r = 0;
        int length = 0;
        while(r < s.length()) {

            

            while( l < r && set.contains(s.charAt(r)) ) {

               
                set.remove(s.charAt(l));
                 l++;
            
            }

            length = Math.max(length , r - l + 1);
            set.add(s.charAt(r));
            r++;
        }
        return length;
    }
}
