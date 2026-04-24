class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0 , j = 0;

        while(i < word.length() && j < abbr.length()) {

            if(!Character.isDigit(abbr.charAt(j))){

                if(word.charAt(i) != abbr.charAt(j)) {
                    return false;
                }
                i++;
                j++;
            }
            else{
                String number = "";
                if(abbr.charAt(j) == '0') {
                    return false;
                }
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    number += abbr.charAt(j);
                    j++;
                }
                i += Integer.valueOf(number);
            }
            
        }
    
        return i == word.length() && j == abbr.length();
    }
}