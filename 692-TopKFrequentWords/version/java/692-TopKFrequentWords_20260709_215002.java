// Last updated: 7/9/2026, 9:50:02 PM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3
4        HashMap<String, Integer> map = new HashMap<>();
5
6        // Count frequency
7        for (String word : words) {
8            map.put(word, map.getOrDefault(word, 0) + 1);
9        }
10
11        // Store unique words
12        List<String> list = new ArrayList<>(map.keySet());
13
14        // Sort according to the question
15        Collections.sort(list, (a, b) -> {
16            if (map.get(a).equals(map.get(b))) {
17                return a.compareTo(b);      // Alphabetical order
18            }
19            return map.get(b) - map.get(a); // Higher frequency first
20        });
21
22        // Take first k words
23        return list.subList(0, k);
24    }
25}