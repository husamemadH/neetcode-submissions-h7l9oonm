class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String , List<String>> map = new HashMap<>();
        for(String str : strs) {
                
            int[] freq = new int[26];

            for(Character c : str.toCharArray()) {

                freq[c - 'a']++;

            }


            String key = Arrays.toString(freq);

            map.putIfAbsent(key , new ArrayList<String>());

            map.get(key).add(str);

        }

        for(List<String> list : map.values())
        {
            ans.add(list);
        }

        return ans;

    }
}
