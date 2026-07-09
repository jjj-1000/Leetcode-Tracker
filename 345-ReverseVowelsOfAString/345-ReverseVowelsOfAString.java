// Last updated: 7/9/2026, 3:11:09 PM
class Solution {

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        String vowels = "aeiouAEIOU";

        while (left < right) {

            // Move left pointer until vowel found
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }

            // Move right pointer until vowel found
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }

            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}