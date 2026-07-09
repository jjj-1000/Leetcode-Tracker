// Last updated: 7/9/2026, 3:13:01 PM
import java.util.*;

class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> wordSet = new HashSet<>(wordList);

        // If endWord is not present
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                String word = queue.poll();

                // If endWord found
                if (word.equals(endWord)) {
                    return level;
                }

                char[] chars = word.toCharArray();

                for (int j = 0; j < chars.length; j++) {

                    char original = chars[j];

                    for (char c = 'a'; c <= 'z'; c++) {

                        chars[j] = c;

                        String newWord = new String(chars);

                        if (wordSet.contains(newWord) && !visited.contains(newWord)) {

                            visited.add(newWord);
                            queue.offer(newWord);
                        }
                    }

                    chars[j] = original;
                }
            }

            level++;
        }

        return 0;
    }
}