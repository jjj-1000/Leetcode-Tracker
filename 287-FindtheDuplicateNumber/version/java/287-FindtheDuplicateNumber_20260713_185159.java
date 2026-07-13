// Last updated: 7/13/2026, 6:51:59 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        for(int i=0;i<nums.length-1;i++)
5            if(nums[i] == nums[i+1]) return nums[i];
6        return -1;
7    }
8}