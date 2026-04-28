class Solution {
    public boolean canPermutePalindrome(String s) {
    
    boolean onlyOneOdd = false;

    Map<Character , Integer> map = new HashMap<>();

    for(int i = 0 ; i < s.length()  ; i++) {

        map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);

        
    }

    int counter = 0;

    for(Character c : map.keySet()) {
        
        counter += map.get(c) % 2;

    }


    return counter <= 1;
    

    }
}
