class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer> , ArrayList<String>> map = new HashMap<>();

        for(String str : strs) {
            List<Integer> list = new ArrayList<>(26); 
    for (int i = 0; i < 26; i++) {
    list.add(0);
    }
            for(int i = 0 ; i < str.length() ; i++) {
                int index = str.charAt(i) - 'a';

                list.set(index , list.get(index) + 1);

            }
            if(map.containsKey(list)) {
                map.get(list).add(str);
            }
            else {
                ArrayList<String> tempList = new ArrayList<>();
                tempList.add(str);
                map.put(list , tempList);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        map.forEach((k, v) -> ans.add(v));

        return ans;
    }
}
