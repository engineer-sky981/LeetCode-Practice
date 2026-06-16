class Solution {
public:
    string reverseWords(string s) {
     reverse(s.begin(), s.end());
        
        int n = s.length();
        int writeIdx = 0;
        
        for (int i = 0; i < n; ++i) {
            if (s[i] != ' ') {
                if (writeIdx > 0) {
                    s[writeIdx++] = ' ';
                }
                
                int start = writeIdx;
                
                while (i < n && s[i] != ' ') {
                    s[writeIdx++] = s[i++];
                }
                
                reverse(s.begin() + start, s.begin() + writeIdx);
            }
        }
        
        s.resize(writeIdx);
        return s;
    }
};