// Last updated: 8/27/2026, 3:54:56 PM
1class Solution {
2    public int equalSubstring(String s, String t, int maxCost) {
3        int res = 0;
4        int cur_cost = 0;
5        int cur_start = 0;
6
7        for (int last_ind = 0; last_ind < s.length(); last_ind++) {
8            cur_cost += Math.abs(s.charAt(last_ind) - t.charAt(last_ind));
9
10            while (cur_cost > maxCost) {
11                cur_cost -= Math.abs(s.charAt(cur_start) - t.charAt(cur_start));
12                cur_start++;
13            }
14
15            if (last_ind - cur_start + 1 > res) {
16                res = last_ind - cur_start + 1;
17            }
18        }
19
20        return res;
21    }
22}