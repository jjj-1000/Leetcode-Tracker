// Last updated: 7/9/2026, 3:11:02 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            count[ch - 'a']++;
        }

        // Check characters in ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (count[ch - 'a'] == 0) {
                return false;
            }

            count[ch - 'a']--;
        }

        return true;
    }
}
