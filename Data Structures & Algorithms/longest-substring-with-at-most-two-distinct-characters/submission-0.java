class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int l = 0 , r = 0;

        Map<Character , Integer> map = new HashMap<>();
        int res = 0;
        while(r != s.length()) {

            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r), 0) + 1);

            while(map.size() > 2) {

                map.put(s.charAt(l) , map.get(s.charAt(l)) - 1);

                if(map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }

            res = Math.max(res , r - l + 1);

            r++;
        }

        return res;
    }
}