// Last updated: 10/13/2026, 7:34:18 PM
1class Solution {
2    public int kthGrammar(int n, int k) {
3        if (k <= 2) return k - 1;
4        return kthGrammar(n - 1, (k + 1) / 2) == 1 ? k % 2 : (k + 1) % 2;
5    }
6}