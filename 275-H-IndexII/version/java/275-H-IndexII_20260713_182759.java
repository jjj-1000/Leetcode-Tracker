// Last updated: 7/13/2026, 6:27:59 PM
1class Solution {
2    public int hIndex(int[] c) {
3        int len=c.length;
4        int l=0,h=len-1;
5        while(l<=h){
6            int m=(h+l)/2;
7            if(c[m]==len-m){
8                return len-m;
9            }else  if(c[m]<len-m){
10                l=m+1;
11
12            }else{
13              h=m-1;
14            }
15        }
16        return len-l;
17    }
18}