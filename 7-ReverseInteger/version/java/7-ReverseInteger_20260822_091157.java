// Last updated: 8/22/2026, 9:11:57 AM
1class Solution {
2    public int reverse(int x) {
3       long rev=0;
4       while(x!=0){
5          rev=rev*10+x%10;
6          x=x/10;
7       }
8       if(rev>Integer.MAX_VALUE ||rev<Integer.MIN_VALUE){
9            return 0;
10       }
11       return (int)rev;
12    }
13}