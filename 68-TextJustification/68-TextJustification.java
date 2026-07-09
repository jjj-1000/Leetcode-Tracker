// Last updated: 7/9/2026, 3:13:41 PM
class Solution {

    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < words.length) {

            int j = i;
            int lineLength = 0;

            // Find words that fit in one line
            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {

                lineLength += words[j].length();
                j++;
            }

            int gaps = j - i - 1;

            StringBuilder line = new StringBuilder();

            // Last line OR single word line -> left justified
            if (j == words.length || gaps == 0) {

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {
                        line.append(" ");
                    }
                }

                // Fill remaining spaces
                while (line.length() < maxWidth) {
                    line.append(" ");
                }

            } else {

                // Fully justified
                int totalSpaces = maxWidth - lineLength;

                int spaceEach = totalSpaces / gaps;

                int extraSpaces = totalSpaces % gaps;

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {

                        // Add equal spaces
                        for (int s = 0; s < spaceEach; s++) {
                            line.append(" ");
                        }

                        // Add extra spaces to left gaps
                        if (extraSpaces > 0) {
                            line.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }

            result.add(line.toString());

            i = j;
        }

        return result;
    }
}