// Last updated: 10/8/2026, 9:00:23 AM
1class Solution {
2    public int bagOfTokensScore(int[] tokens, int power) {
3        Arrays.sort(tokens);
4        int s = 0;
5        int maxi = 0;
6        int l = 0, r = tokens.length - 1;
7
8        while (l <= r) {
9            if (power >= tokens[l]) {
10                power -= tokens[l];
11                s++;
12                l++;
13                maxi = Math.max(maxi, s);
14            } else if (s > 0) {
15                power += tokens[r];
16                s--;
17                r--;
18            } else {
19                break;
20            }
21        }
22
23        return maxi;
24    }
25}