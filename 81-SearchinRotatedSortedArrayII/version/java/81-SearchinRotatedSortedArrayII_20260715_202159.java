// Last updated: 7/15/2026, 8:21:59 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int n = nums.length;
4        int l = 0;
5        int r = n - 1;
6        while (r >= l) {             // both l and r goes to min index
7            int m = (l + r) / 2;
8            if (nums[m] == target)
9                return true;
10
11
12            if (nums[m] == nums[l] && nums[m] == nums[r]) {        //FIXING WHERE IF L M AND R ARE SAME
13                r -= 1;     
14                l += 1;
15                continue;
16            }
17
18
19
20            if (nums[l] > nums[m]) {            // right side sorted
21                if (target >= nums[m] && target <= nums[r])
22                    l = m + 1;
23                else
24                    r = m - 1;
25            }
26            else {
27                if (target >= nums[l] && target <= nums[m])
28                    r = m - 1;
29                else
30                    l = m + 1;
31            }
32        }
33        return false;
34    }
35}