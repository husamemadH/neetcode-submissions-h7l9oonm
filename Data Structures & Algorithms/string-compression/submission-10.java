class Solution {
    public int compress(char[] chars) {
        int l = 0 , w = 0;

        while(l < chars.length) {

            chars[w++] = chars[l];

            int r = l + 1;

            while(r < chars.length && chars[l] == chars[r]) r++;

            int count = r - l;

            if(count > 1) {
                String cnt = String.valueOf(count);

                for(Character c : cnt.toCharArray()) {
                    chars[w++] = c;
                }

            }

            l = r;



        }

        return w;
    }
}