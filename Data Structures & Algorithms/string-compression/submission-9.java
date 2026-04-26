class Solution {
    public int compress(char[] chars) {
        int w = 0 , l = 0 , r = 0; 
        int counter = 0;
        while(r < chars.length) {

            if(chars[r] == chars[l]) {
                r++;
                counter++;
            }
            else{
                chars[w] = chars[l];
                 w++;
                if(counter > 1) {
                    
                char[] arr = String.valueOf(counter).toCharArray();
                
                for(Character c : arr) {
                   
                    chars[w] = c;
                    w++;
                }
                }
               
                
                counter = 0;
                l = r;



            }
        }

        chars[w] = chars[l];
        w++;
        if(counter > 1) {
             char[] arr = String.valueOf(counter).toCharArray();
                for(Character c : arr) {
                    chars[w] = c;
                    w++;
                }
                
        }
    
    return w;
    }
}