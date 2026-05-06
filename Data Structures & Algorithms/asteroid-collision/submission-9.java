class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stk = new Stack<>();

        for(int asteroid : asteroids) {

            while(!stk.isEmpty() && asteroid < 0 && stk.peek() > 0) {
                
                int diff = stk.peek() + asteroid;

                if(diff > 0) {
                    asteroid = 0;
                }
                else if (diff < 0) {
                    stk.pop();
                }
                else{
                    stk.pop();
                    asteroid = 0;
                }

              



            }
          if(asteroid != 0) {
                    stk.push(asteroid);
                }
        }

        return stk.stream().mapToInt(i -> i).toArray();

    }
}