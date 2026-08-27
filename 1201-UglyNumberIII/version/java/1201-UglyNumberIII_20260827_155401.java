// Last updated: 8/27/2026, 3:54:01 PM
1class Solution {
2    public int nthUglyNumber(int n, int a, int b, int c) {
3        int left = 1;
4        int right = Integer.MAX_VALUE;
5        int count = 0;
6        while (left < right) {
7            int middle = left + (right - left) / 2;
8            if (isUgly(middle, a, b, c, n)) {
9                right = middle;
10            }
11            else
12                left = middle + 1;
13        }
14        return left;
15    }
16    public boolean isUgly(long middle, long a, long b, long c, long n) {
17        return (int) (middle/a + middle/b + middle/c - middle/lcm(a, b) - middle/lcm(b, c) - middle/lcm(c, a) + middle/lcm(a, lcm(b, c))) >= n;
18    }
19    public long gcd(long a, long b) {
20        if (a == 0)
21            return b;
22        else return gcd(b%a, a);
23    }
24    public long lcm(long a, long b) {
25        return a * b / (gcd(a, b)); 
26    }
27}