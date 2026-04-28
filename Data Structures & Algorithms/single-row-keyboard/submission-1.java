class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character , Integer> map = new HashMap<>();
//      
        int sum = 0;
        int lastIndex = 0;

        for(int i = 0 ; i < keyboard.length() ; i++) {

            map.put(keyboard.charAt(i) , i);

        }

        for(int i = 0 ; i < word.length() ; i++) {

            sum += Math.abs(map.get(word.charAt(i)) - lastIndex );
            lastIndex = map.get(word.charAt(i));
        }

        return sum;
    }
}
