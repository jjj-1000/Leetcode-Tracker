// Last updated: 7/13/2026, 6:57:04 PM
1public class Solution {
2    public int lengthOfLIS(int[] nums) {
3        if (nums == null || nums.length == 0) {
4            return 0;
5        }
6
7        int n = nums.length;
8        int[] dp = new int[n];
9        Arrays.fill(dp, 1);
10
11        for (int i = 1; i < n; ++i) {
12            for (int j = 0; j < i; ++j) {
13                if (nums[i] > nums[j]) {
14                    dp[i] = Math.max(dp[i], dp[j] + 1);
15                }
16            }
17        }
18
19        int maxLength = Arrays.stream(dp).max().orElse(0);
20        return maxLength;
21    }
22}