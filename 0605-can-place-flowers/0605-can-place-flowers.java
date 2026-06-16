class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int count = 0;
        int size = flowerbed.length;
        
        for (int i = 0; i < size; ++i) {
            // Agar pehle hi required 'n' flowers lag chuke hain, toh loop ko turant rok dein
            if (count >= n) {
                return true;
            }
            
            // Check karein ki kya current seat/plot khali (0) hai
            if (flowerbed[i] == 0) {
                // Check karein ki left side khali hai (ya fir ye start boundary i == 0 hai)
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                
                // Check karein ki right side khali hai (ya fir ye end boundary i == size - 1 hai)
                boolean rightEmpty = (i == size - 1) || (flowerbed[i + 1] == 0);
                
                // Agar dono sides (left aur right) khali hain, toh flower laga sakte hain
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Flower laga diya (seat occupy kar li)
                    count++;          // Lagaye gaye flowers ka count badha diya
                }
            }
        }
        
        // Check karein ki kya total lagaye gaye flowers 'n' ke barabar ya usse bade hain
        return count >= n;
    }
}