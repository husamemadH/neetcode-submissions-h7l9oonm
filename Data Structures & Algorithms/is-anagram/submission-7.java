class Solution {
    public boolean isAnagram(String s, String t) {
                int[] freq = new int[26];


                for(Character c : s.toCharArray()) {


                    freq[c - 'a']++;

                }

                  for(Character c : t.toCharArray()) {


                    freq[c - 'a']--;

                }


                for(int n : freq) {

                    if(n != 0) {
                        return false;
                    }
                }

                return true;
    }
}
