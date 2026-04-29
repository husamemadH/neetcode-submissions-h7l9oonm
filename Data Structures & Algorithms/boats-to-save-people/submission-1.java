class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int ans = 0;

        int l = 0 , r = people.length - 1;
        
        while(r >= 0 && people[r] == limit) {
                ans++;
                r--;
            }

        while(l <= r) {
            
            
            int sum = people[l] + people[r];

            if(sum <= limit) {
                ans++;
                l++;
                r--;
            }
            else{
                ans++;
                r--;
            }

        }

        return ans;

    }
}