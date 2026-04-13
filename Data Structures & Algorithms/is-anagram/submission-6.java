class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr = new int[26];

        for(Character c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        for(Character c : t.toCharArray()) {
            arr[c - 'a']--;
        }

        for(int val : arr) {
            if(val != 0) {
                return false;
            }
        }
        return true;
    }
}
