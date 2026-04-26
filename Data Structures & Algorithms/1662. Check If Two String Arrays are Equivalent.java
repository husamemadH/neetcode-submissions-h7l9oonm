class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for(String w : word1) {

            for(Character c : w.toCharArray()) {
                stk1.push(c);
            }
        }
        

        for(String w : word2) {

            for(Character c : w.toCharArray()) {
                stk2.push(c);
            }
        }
        return stk1.equals(stk2);
    }
}
