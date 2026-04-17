class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        Map<Character , Character> map = new HashMap<>();

        map.put('}' , '{');
        map.put(']' , '[');
        map.put(')' , '(');


        for(Character c : s.toCharArray()) {

            if(!stack.isEmpty() && stack.peek() == map.get(c)) {
                    stack.pop();
            }
            else{
                stack.push(c);
            }


        }

    
    return stack.isEmpty();

    }
}
