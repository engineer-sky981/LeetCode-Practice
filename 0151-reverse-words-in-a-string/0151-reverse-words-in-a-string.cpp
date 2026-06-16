class Solution {
public:
    string reverseWords(string s) {
         vector<string> words;
        string temp = "";
        
        // Step 1: Ek-ek karke words nikalna
        for (char c : s) {
            if (c != ' ') {
                temp += c; // Word mein character add karo
            } else {
                if (!temp.empty()) {
                    words.push_back(temp); // List mein add karo
                    temp = ""; // Temp ko khali karo
                }
            }
        }
        
        // Loop ke baad bacha hua aakhri word add karna
        if (!temp.empty()) {
            words.push_back(temp);
        }
        
        // Step 2: Words ko peeche se jodna
        string result = "";
        for (int i = words.size() - 1; i >= 0; --i) {
            result += words[i];
            if (i > 0) {
                result += " "; // Beech mein single space lagana
            }
        }
        
        return result;
    }
};