// Last updated: 10/8/2026, 9:01:12 AM
1class Solution {
2    public int maxWidthRamp(int[] nums) {
3        int ans = 0;
4        int n = nums.length;
5
6        // Create a list of pairs (element, index)
7        List<int[]> vp = new ArrayList<>();
8        for (int i = 0; i < n; i++) {
9            vp.add(new int[]{nums[i], i});
10        }
11
12        // Sort the list based on the element values
13        vp.sort((a, b) -> a[0] - b[0]);
14
15        // Keep track of the minimum index seen so far
16        int minIndex = vp.get(0)[1];
17
18        // Traverse the sorted list to calculate the maximum width ramp
19        for (int i = 1; i < n; i++) {
20            int currentIndex = vp.get(i)[1];
21            ans = Math.max(ans, currentIndex - minIndex);
22            minIndex = Math.min(minIndex, currentIndex);
23        }
24
25        return ans;
26    }
27}