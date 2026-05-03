class Solution {
    public int numUniqueEmails(String[] emails) {
        Map<String , Set> map = new HashMap<>();
        int ans = 0;
        for(String email : emails) {

            String[] emailSplit = email.split("@");
            StringBuilder actualEmail = new StringBuilder();

            for(int i = 0 ; i < emailSplit[0].length() ; i++) {

                if(emailSplit[0].charAt(i) == '+') {
                    break;
                }
                else if(emailSplit[0].charAt(i) == '.') {
                    continue;
                }
                else{
                    actualEmail.append(emailSplit[0].charAt(i));
                }
            }
            System.out.println(actualEmail.toString());
            map.computeIfAbsent(emailSplit[1] ,  k -> new HashSet<>());
            System.out.println(emailSplit[1]);
            map.get(emailSplit[1]).add(actualEmail.toString());
                


        }

        for(String domain : map.keySet()) {

            ans += map.get(domain).size();
        }

        return ans;

    }
}