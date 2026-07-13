// Last updated: 7/13/2026, 6:24:07 PM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int left = 0 ;
7        int right = n ;
8        while(left < right ){
9            int mid = left + (right - left )/2;
10            if(isBadVersion(mid)){
11                right = mid ;
12
13            }
14            else 
15            left = mid+1 ;
16        } return left ;
17    }
18}