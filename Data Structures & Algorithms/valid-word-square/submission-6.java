class Solution {
    public boolean validWordSquare(List<String> words) {
        int r = 0 , c = 0;

        while(c < words.size()) {

            String column = "";

            for(String word : words) {

                if(c < word.length())
                column += word.charAt(c);

                
            }
            System.out.println(column);
            c++;
            String row = words.get(r);

            if(!row.equals(column)) {
                return false;
            } 
            
            r++;

            }

            return true;
        }

}
        
    

