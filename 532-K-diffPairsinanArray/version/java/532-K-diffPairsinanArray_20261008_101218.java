// Last updated: 10/8/2026, 10:12:18 AM
1class Solution {
2    public int findPairs(int[] nums, int k) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        for (int a : nums) {
7            map.put(a, map.getOrDefault(a, 0) + 1);
8        }
9
10        int count = 0;
11
12        if (k == 0) {
13            for (int a : map.keySet()) {
14                if (map.get(a) > 1) {
15                    count++;
16                }
17            }
18        } else {
19            for (int a : map.keySet()) {
20                if (map.containsKey(a + k)) {
21                    count++;
22                }
23            }
24        }
25
26        return count;
27    }
28}