// Last updated: 7/30/2026, 8:36:32 PM
1class Solution {
2    public int nthUglyNumber(int n) {
3
4        int[] ugly = new int[n];
5
6        ugly[0] = 1;
7
8        int i2 = 0;
9        int i3 = 0;
10        int i5 = 0;
11
12        for (int i = 1; i < n; i++) {
13
14            int next2 = ugly[i2] * 2;
15            int next3 = ugly[i3] * 3;
16            int next5 = ugly[i5] * 5;
17
18            int nextUgly = Math.min(next2, Math.min(next3, next5));
19
20            ugly[i] = nextUgly;
21
22            if (nextUgly == next2) {
23                i2++;
24            }
25
26            if (nextUgly == next3) {
27                i3++;
28            }
29
30            if (nextUgly == next5) {
31                i5++;
32            }
33        }
34
35        return ugly[n - 1];
36    }
37}