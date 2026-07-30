// Last updated: 7/30/2026, 8:58:42 PM
1class Solution {
2    public int nthSuperUglyNumber(int n, int[] primes) {
3
4        int k = primes.length;
5
6        long[] ugly = new long[n];
7        int[] index = new int[k];
8        long[] next = new long[k];
9
10        ugly[0] = 1;
11
12        // Initialize next values
13        for (int i = 0; i < k; i++) {
14            next[i] = primes[i];
15        }
16
17        for (int i = 1; i < n; i++) {
18
19            long min = next[0];
20
21            // Find minimum value
22            for (int j = 1; j < k; j++) {
23                min = Math.min(min, next[j]);
24            }
25
26            ugly[i] = min;
27
28            // Update all matching values
29            for (int j = 0; j < k; j++) {
30
31                if (next[j] == min) {
32                    index[j]++;
33
34                    next[j] = ugly[index[j]] * primes[j];
35                }
36            }
37        }
38
39        return (int) ugly[n - 1];
40    }
41}