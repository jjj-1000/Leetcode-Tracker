// Last updated: 7/9/2026, 3:11:23 PM
class Solution {
    public int maxProduct(String[] words) {

        int n = words.length;

        // Store bitmask for each word
        int[] mask = new int[n];

        for (int i = 0; i < n; i++) {

            for (char ch : words[i].toCharArray()) {

                // Set bit for each character
                mask[i] |= (1 << (ch - 'a'));
            }
        }

        int max = 0;

        // Compare every pair of words
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                // No common characters
                if ((mask[i] & mask[j]) == 0) {

                    int product = words[i].length() * words[j].length();

                    max = Math.max(max, product);
                }
            }
        }

        return max;
    }
}