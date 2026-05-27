class Solution {
    public boolean isValid(String s) {
        Map<Character , Character> map = new HashMap<>();
        Stack<Character> stk = new Stack<>();
        map.put(']' , '[');
        map.put(')' , '(');
        map.put('}' , '{');

        for(Character c : s.toCharArray()) {
            
            if(!stk.isEmpty() && stk.peek() == map.get(c)) {
                stk.pop();
            }
            else{
                stk.push(c);
            }
        }

        return stk.isEmpty();
    }
}
