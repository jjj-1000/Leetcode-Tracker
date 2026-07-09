// Last updated: 7/9/2026, 3:14:29 PM
class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
        vector<int> result;

        if (s.empty() || words.empty()) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.size();
        int totalLen = wordLen * wordCount;

        unordered_map<string, int> target;

        // Store frequency of words
        for (string word : words) {
            target[word]++;
        }

        // Try each possible starting position
        for (int i = 0; i < wordLen; i++) {
            unordered_map<string, int> window;
            int left = i;
            int count = 0;

            // Move right pointer in steps of wordLen
            for (int right = i; right + wordLen <= s.length(); right += wordLen) {
                string word = s.substr(right, wordLen);

                // If the word is one of the target words
                if (target.count(word)) {
                    window[word]++;
                    count++;

                    // Shrink the window if word frequency exceeds target
                    while (window[word] > target[word]) {
                        string leftWord = s.substr(left, wordLen);
                        window[leftWord]--;
                        left += wordLen;
                        count--;
                    }

                    // If all words are matched
                    if (count == wordCount) {
                        result.push_back(left);

                        // Move window forward
                        string leftWord = s.substr(left, wordLen);
                        window[leftWord]--;
                        left += wordLen;
                        count--;
                    }
                }
                else {
                    // Reset the window
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return result;
    }
};