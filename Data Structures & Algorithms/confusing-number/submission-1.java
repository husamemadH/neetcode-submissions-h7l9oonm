class Solution {
    public boolean confusingNumber(int n) {
        Map<Character , Character> map = new HashMap<>();

        map.put('8' , '8');
        map.put('6', '9');
        map.put('1' , '1');
        map.put('9', '6');
        map.put('0' , '0');

        String beg = String.valueOf(n);

        String ans = "";

        for(int i = beg.length() - 1 ; i >= 0 ; i--) {
    
            if(!map.containsKey(beg.charAt(i)))
                return false;
            else{
                ans += map.get(beg.charAt(i));
            }
        }



        return !ans.equals(beg);
    }
}
