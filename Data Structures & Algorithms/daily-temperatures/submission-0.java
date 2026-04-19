class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); //[temp , index]

        for(int i = 0 ; i < temperatures.length ; i++) {
            int t = temperatures[i];

            while(!stack.isEmpty() && t > stack.peek()[0]) {
                
                res[stack.peek()[1]] = i - stack.peek()[1];
                stack.pop();

            }

            stack.push(new int[] {t , i});
        }

        return res;

    }
}
