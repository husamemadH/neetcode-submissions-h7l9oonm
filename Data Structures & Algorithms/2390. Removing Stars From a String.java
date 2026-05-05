class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(Character c : s.toCharArray()) {

            if(c == '*') {
                stk.pop();
            }
            else{
                stk.push(c);
            }
        }
            Stack<Character> stk2 = new Stack<>();

            while(!stk.isEmpty()) {
                stk2.push(stk.pop());
            }
            while(!stk2.isEmpty()) {
                ans.append(stk2.pop());
            }

            return ans.toString();
    }
}
