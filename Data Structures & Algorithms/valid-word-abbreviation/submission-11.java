class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0 , j = 0;

        while(i < word.length() && j < word.length()) {

            if(Character.isDigit(abbr.charAt(j))) {
                if(abbr.charAt(j) == '0') {
                    return false;
                }
                else{
                    String number = "";
                    while(j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                        number += abbr.charAt(j);
                        j++;
                    }

                    i += Integer.valueOf(number);
                }
            }

            else{
                if(abbr.charAt(j) != word.charAt(i)) {
                    return false;
                }
                i++;
                j++;
            }


        }
        return i == word.length() && j == abbr.length();
    }
}