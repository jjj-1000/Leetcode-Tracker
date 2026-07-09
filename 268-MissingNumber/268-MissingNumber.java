// Last updated: 7/9/2026, 3:11:35 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int e=n*(n+1)/2;
        int a=0;
        for(int x:nums){
            a=a+x;

        }
        return e-a;
    }
}