// Last updated: 7/9/2026, 3:10:26 PM
class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[256];

        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Store unique characters
        List<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            }
        }

        // Sort by frequency descending
        Collections.sort(list, (a, b) -> freq[b] - freq[a]);

        // Build answer
        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            for (int i = 0; i < freq[c]; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}