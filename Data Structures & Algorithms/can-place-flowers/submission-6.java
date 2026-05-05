class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int can = 0;
        if(n == 0) {
            return true;
        }
        if(flowerbed.length == 1) {
            
            return flowerbed[0] == 0;
        }
        
        if(flowerbed[0] == 0 && flowerbed[0 + 1] == 0) {
            can++;
            flowerbed[0] = 1;
        }
        if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            can++;
        }
        int l = 0 , r = 1;
        
        while(r != flowerbed.length - 1) {

            if(flowerbed[r] == 0 && flowerbed[l] == 0 && flowerbed[r + 1] == 0) {
                can++;
                flowerbed[r] = 1;
            }

            r++;
            l++;
        }

        return can >= n;
    }
}