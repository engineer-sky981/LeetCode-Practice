class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray(); // Java strings immutable hain, isliye char array use kiya
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            // Left pointer ko aage badhayein jab tak koi vowel nahi milta
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Right pointer ko peeche badhayein jab tak koi vowel nahi milta
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            // Agar dono side vowels mil gaye, toh elements swap karein
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars); // don't forget.. Modified char array ko waapas String mein convert kiya
    }
}