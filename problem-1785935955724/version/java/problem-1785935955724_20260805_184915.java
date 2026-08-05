// Last updated: 8/5/2026, 6:49:15 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n =nums.length;
4        int l=0;
5        int r=n-1;
6        while(l<r){
7            int mid=l+(r-l)/2;
8            if(nums[mid]<nums[mid+1]){
9                l=mid+1;
10            }else{
11                r=mid;
12            }
13        }
14        return l;
15    }
16}