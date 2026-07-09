// Last updated: 7/9/2026, 3:10:59 PM
class Solution {
    public int lengthLongestPath(String input) {
        String[] parts = input.split("\n");

        // stores current path length at each depth
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        int maxLen = 0;

        for (String s : parts) {

            // count level using tabs
            int level = s.lastIndexOf("\t") + 1;

            // remove tabs to get actual name
            int len = s.length() - level;

            // check if it is a file
            if (s.contains(".")) {

                // total length = parent path + current file length
                maxLen = Math.max(maxLen,
                        map.get(level) + len);

            } else {

                // store path length for next level
                map.put(level + 1,
                        map.get(level) + len + 1);
                // +1 for '/'
            }
        }

        return maxLen;
    }
}



        