// Last updated: 8/27/2026, 3:56:35 PM
1class Solution {
2    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
3
4        int n = startTime.length;
5
6        int[][] jobs = new int[n][3];
7
8        for (int i = 0; i < n; i++) {
9            jobs[i][0] = startTime[i];
10            jobs[i][1] = endTime[i];
11            jobs[i][2] = profit[i];
12        }
13
14        // Sort by end time
15        Arrays.sort(jobs, (a, b) -> Integer.compare(a[1], b[1]));
16
17        int[] dp = new int[n];
18
19        dp[0] = jobs[0][2];
20
21        for (int i = 1; i < n; i++) {
22
23            // Don't take current job
24            int skip = dp[i - 1];
25
26            // Take current job
27            int take = jobs[i][2];
28
29            int j = findLastNonOverlappingJob(jobs, i, jobs[i][0]);
30
31            if (j != -1) {
32                take += dp[j];
33            }
34
35            dp[i] = Math.max(skip, take);
36        }
37
38        return dp[n - 1];
39    }
40
41    private int findLastNonOverlappingJob(int[][] jobs, int index, int startTime) {
42
43        int low = 0;
44        int high = index - 1;
45        int answer = -1;
46
47        while (low <= high) {
48
49            int mid = low + (high - low) / 2;
50
51            if (jobs[mid][1] <= startTime) {
52                answer = mid;
53                low = mid + 1;
54            } else {
55                high = mid - 1;
56            }
57        }
58
59        return answer;
60    }
61}