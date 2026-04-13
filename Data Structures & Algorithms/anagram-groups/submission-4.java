class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String , List<String>> map = new HashMap<>();

        for(String str : strs) {

            int[] freq = new int[26];
            for(Character c : str.toCharArray()) {
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(str);

        }

        return new ArrayList<>(map.values());
    }
}
