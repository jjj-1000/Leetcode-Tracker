// Last updated: 7/9/2026, 3:14:19 PM
class Solution {
    public String countAndSay(int n) {

        String result = "1";

        // Generate sequence from 2 to n
        for (int i = 2; i <= n; i++) {

            StringBuilder temp = new StringBuilder();

            int count = 1;

            // Traverse current result string
            for (int j = 1; j < result.length(); j++) {

                // If same digit repeats
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } 
                else {

                    // Append count and digit
                    temp.append(count);
                    temp.append(result.charAt(j - 1));

                    // Reset count
                    count = 1;
                }
            }

            // Append last group
            temp.append(count);
            temp.append(result.charAt(result.length() - 1));

            // Update result
            result = temp.toString();
        }

        return result;
    }
}