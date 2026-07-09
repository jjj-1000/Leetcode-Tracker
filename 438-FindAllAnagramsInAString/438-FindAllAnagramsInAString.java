// Last updated: 7/9/2026, 3:10:31 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        int m = s.length();
        int n = p.length();

        // Base Case
        if (n > m)
            return res;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Build First Window
        for (int i = 0; i < n; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }

        // Check First Window
        if (Arrays.equals(freq1, freq2))
            res.add(0);

        // Slide Window
        for (int i = n; i < m; i++) {

            // Add incoming character
            freq1[s.charAt(i) - 'a']++;

            // Remove outgoing character
            freq1[s.charAt(i - n) - 'a']--;

            // Compare frequencies
            if (Arrays.equals(freq1, freq2))
                res.add(i - n + 1);
        }

        return res;
    }
}