class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<int[]> stack = new Stack(); // temp , index

        for(int i = 0 ; i < temperatures.length ; i++) {

            int temp = temperatures[i];

            while(!stack.isEmpty() && temp > stack.peek()[0]) {

                ans[stack.peek()[1]] = i - stack.peek()[1];
                
                stack.pop();

            }

            stack.push(new int[] { temp , i});


        }

        return ans;
    }
}
