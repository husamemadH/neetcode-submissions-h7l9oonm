class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        Stack<Integer> stk = new Stack<>();

        for(String operation : operations) {

            if(operation.equals("D")) {

                stk.push(stk.peek() * 2);

            }
            else if (operation.equals("+")) {

                int v1 = stk.pop();

                int v2 = stk.pop();

                int result = v1 + v2;

                stk.push(v2);
                stk.push(v1);
                stk.push(result);

            }
            else if(operation.equals("C")) {
                stk.pop();
            }
            else{
                stk.push(Integer.parseInt(operation));
            }

        }

        while(!stk.isEmpty()) {
            score += stk.pop();
        }

        return score;

    }
}