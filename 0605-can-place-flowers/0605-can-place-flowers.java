class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int count = 0;
        int size = flowerbed.length;
        
        for (int i = 0; i < size; ++i) {
            // Early return memory aur computation dono bachata hai
            if (count >= n) {
                return true;
            }
            
            // Bina extra variables banaye direct check karein
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == size - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1; // Flower laga diya
                    count++;
                }
            }
        }
        
        return count >= n;
    }
}