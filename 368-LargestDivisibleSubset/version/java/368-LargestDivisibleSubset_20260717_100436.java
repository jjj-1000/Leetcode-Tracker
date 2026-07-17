// Last updated: 7/17/2026, 10:04:36 AM
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Arrays.fill(dp, 1);
6        Arrays.sort(nums);
7        
8        int maxSize = 1, maxIndex = 0;
9        for (int i = 1; i < n; i++) {
10            for (int j = 0; j < i; j++) {
11                if (nums[i] % nums[j] == 0) {
12                    dp[i] = Math.max(dp[i], dp[j] + 1);
13                    if (dp[i] > maxSize) {
14                        maxSize = dp[i];
15                        maxIndex = i;
16                    }
17                }
18            }
19        }
20        
21        List<Integer> result = new ArrayList<>();
22        int num = nums[maxIndex];
23        for (int i = maxIndex; i >= 0; i--) {
24            if (num % nums[i] == 0 && dp[i] == maxSize) {
25                result.add(nums[i]);
26                num = nums[i];
27                maxSize--;
28            }
29        }
30        
31        return result;
32    }
33}
34