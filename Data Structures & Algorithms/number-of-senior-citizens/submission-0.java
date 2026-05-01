class Solution {
    public int countSeniors(String[] details) {

        int ans = 0;

        for(String detail : details) {
        int age = detail.charAt(detail.length() - 4) - '0';

        age *= 10;
        
        age += detail.charAt(detail.length() - 3) - '0';

        if(age > 60) {
            ans++;
        }
            

        }

        return ans;

    }
}