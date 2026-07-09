// Last updated: 7/9/2026, 3:11:27 PM
class Solution {
    public String getHint(String secret, String guess) {

        int bulls = 0;
        int cows = 0;

        int[] count = new int[10];

        for (int i = 0; i < secret.length(); i++) {

            char s = secret.charAt(i);
            char g = guess.charAt(i);

            // Bull found
            if (s == g) {
                bulls++;
            } else {

                // If previously seen guess digit can match current secret digit
                if (count[s - '0'] < 0) {
                    cows++;
                }

                // If previously seen secret digit can match current guess digit
                if (count[g - '0'] > 0) {
                    cows++;
                }

                // Update counts
                count[s - '0']++;
                count[g - '0']--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
