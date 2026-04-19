class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack  = new Stack<>();

        for(String s : tokens) {

            if(!s.equals("/") && !s.equals("*") && !s.equals("+") && !s.equals("-")) {

                stack.push(Integer.valueOf(s));

            }
            else{
                int val = stack.pop();
                int val2 = stack.pop();

                if(s.equals("+")) {
                    stack.push(val + val2);
                }
                if(s.equals("-")) {
                    stack.push(val2 - val);
                }
                if(s.equals("/")) {
                    stack.push(val2 / val);
                }
                if(s.equals("*")) {
                    stack.push(val2 * val);
                }
            }
        }

    return stack.pop();

    }
}
