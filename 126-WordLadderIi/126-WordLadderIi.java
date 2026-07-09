// Last updated: 7/9/2026, 3:13:03 PM
import java.util.*;

class Solution {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        Set<String> wordSet = new HashSet<>(wordList);
        List<List<String>> result = new ArrayList<>();

        // If endWord is not present, return empty list
        if (!wordSet.contains(endWord)) {
            return result;
        }

        // Map to store parent relationships
        Map<String, List<String>> parentMap = new HashMap<>();

        // BFS variables
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        boolean found = false;

        while (!queue.isEmpty() && !found) {

            int size = queue.size();

            // Words visited in current level
            Set<String> currentLevelVisited = new HashSet<>();

            for (int i = 0; i < size; i++) {

                String word = queue.poll();
                char[] chars = word.toCharArray();

                for (int j = 0; j < chars.length; j++) {

                    char original = chars[j];

                    for (char c = 'a'; c <= 'z'; c++) {

                        chars[j] = c;
                        String newWord = new String(chars);

                        if (!wordSet.contains(newWord)) {
                            continue;
                        }

                        if (!visited.contains(newWord)) {

                            if (!currentLevelVisited.contains(newWord)) {
                                queue.offer(newWord);
                                currentLevelVisited.add(newWord);
                            }

                            // Store parent
                            parentMap
                                    .computeIfAbsent(newWord, k -> new ArrayList<>())
                                    .add(word);

                            if (newWord.equals(endWord)) {
                                found = true;
                            }
                        }
                    }

                    chars[j] = original;
                }
            }

            visited.addAll(currentLevelVisited);
        }

        // Backtracking to build paths
        if (found) {
            List<String> path = new ArrayList<>();
            path.add(endWord);

            backtrack(endWord, beginWord, parentMap, path, result);
        }

        return result;
    }

    private void backtrack(String word,
                           String beginWord,
                           Map<String, List<String>> parentMap,
                           List<String> path,
                           List<List<String>> result) {

        if (word.equals(beginWord)) {

            List<String> temp = new ArrayList<>(path);
            Collections.reverse(temp);
            result.add(temp);

            return;
        }

        if (!parentMap.containsKey(word)) {
            return;
        }

        for (String parent : parentMap.get(word)) {

            path.add(parent);

            backtrack(parent, beginWord, parentMap, path, result);

            path.remove(path.size() - 1);
        }
    }
}