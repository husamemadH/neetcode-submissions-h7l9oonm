class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for(String email : emails) {
            
            String[] pair = email.split("@");
            StringBuilder actualEmail = new StringBuilder();
            for(int i = 0 ; i < pair[0].length() ; i++) {

                if(pair[0].charAt(i) == '+') {
                    break;
                }   
                else if (pair[0].charAt(i) == '.') {
                    continue;
                }
                else{
                    actualEmail.append(pair[0].charAt(i));
                }
                
            }

            set.add(actualEmail.toString()+pair[1]);

        }
  return set.size();
    }
}