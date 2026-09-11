// Last updated: 9/11/2026, 6:48:13 PM
1class Solution {
2     public int[] findRightInterval(int[][] intervals) {
3        TreeMap<Integer, Integer> startPoints = new TreeMap<>();
4        for(int i=0; i<intervals.length; i++){
5            startPoints.put(intervals[i][0], i);
6        }
7        
8        int[] ans = new int[intervals.length];
9        for(int i=0; i<intervals.length; i++){
10            Integer nextClosestStartPoint = startPoints.ceilingKey(intervals[i][1]);
11            ans[i]= nextClosestStartPoint==null ? -1 : startPoints.get(nextClosestStartPoint);
12        }
13        return ans;
14    }
15}