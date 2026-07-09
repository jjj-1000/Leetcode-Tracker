// Last updated: 7/9/2026, 3:06:09 PM
class Solution {
    public int getLeastFrequentDigit(int n) {

        int[] freq = new int[10];

        // Count digits
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int minFreq = Integer.MAX_VALUE;
        int ans = 0;

        // Find least frequent digit
        for (int i = 0; i < 10; i++) {

            if (freq[i] > 0 && freq[i] < minFreq) {
                minFreq = freq[i];
                ans = i;
            }
        }

        return ans;
    }
}