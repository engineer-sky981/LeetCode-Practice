class Solution {
    public int compress(char[] chars) {
        int writeIdx = 0;
        int i = 0;
        int n = chars.length;

        while (i < n) {
            int j = i;
            while (j < n && chars[j] == chars[i]) {
                j++;
            }

            chars[writeIdx++] = chars[i];

            int count = j - i;
            if (count > 1) {
                String s = String.valueOf(count);
                for (char c : s.toCharArray()) {
                    chars[writeIdx++] = c;
                }
            }

            i = j;
        }

        return writeIdx;
    }
}