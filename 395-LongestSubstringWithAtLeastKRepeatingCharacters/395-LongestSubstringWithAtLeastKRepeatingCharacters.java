// Last updated: 7/9/2026, 3:10:51 PM
class Solution {
    public int longestSubstring(String s, int k) {

        // Base case
        if (s == null || s.length() == 0) {
            return 0;
        }

        return helper(s, k);
    }

    private int helper(String s, int k) {

        // Count frequency of characters
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // Find invalid character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (count[ch - 'a'] < k) {

                // Split string and solve recursively
                int left = helper(s.substring(0, i), k);
                int right = helper(s.substring(i + 1), k);

                return Math.max(left, right);
            }
        }

        // Entire string is valid
        return s.length();
    }
}