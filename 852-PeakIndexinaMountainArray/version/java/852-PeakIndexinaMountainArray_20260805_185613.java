// Last updated: 8/5/2026, 6:56:13 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int n=arr.length;
4        int l=0;
5        int r=n-1;
6        while(l<r){
7            int mid=l+(r-l)/2;
8            if(arr[mid]<arr[mid+1]){
9                l=mid+1;
10
11            }else if(arr[mid]>arr[mid+1]){
12                r= mid;
13            }
14            
15        }
16        return l;
17    }
18}