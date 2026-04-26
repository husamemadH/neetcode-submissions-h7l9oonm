class Solution {
    private int nextValidIndex(String s , int index) {
        int skip = 0;

        while(index >= 0) {
            
            if(s.charAt(index) == '#') {
                skip++;
                index--;
            }
            else if(skip > 0) {
                skip--;
                index--;
            }
            else {
                break;
            }

        }
        return index;
    }
    public boolean backspaceCompare(String s, String t) {

        int i = s.length() - 1;
        int j = t.length() - 1;

        while(i >= 0 || j >= 0) {

            i = nextValidIndex(s , i);
            j = nextValidIndex(t , j);

            if(i < 0 && j < 0) {
                
                return true;
            }

            if(i < 0 || j < 0) {
                return false;
            }

            if(s.charAt(i) != t.charAt(j)) {
                return false;
            }
            i--;
            j--;
        }

        return true;

    }


}
