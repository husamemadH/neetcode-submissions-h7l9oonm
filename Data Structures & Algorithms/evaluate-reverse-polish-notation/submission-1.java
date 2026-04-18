class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        for(String s : tokens) {
            
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(Integer.valueOf(s));
            }

            else{
                Integer v1 = stack.pop();
                Integer v2 = stack.pop();
                if(s.equals("+")) {
                    Integer value = v2 + v1;
                    stack.push(value);
                } 
                 if(s.equals("-")) {
                    Integer value = v2 - v1;
                    stack.push(value);
                } 
                if(s.equals("/")) {
                    Integer value = v2 / v1;
                    stack.push(value);
                }
                if(s.equals("*")) {
                    Integer value = v2 * v1;
                    stack.push(value);
                }
            }



        }
    return stack.pop();
    }
}