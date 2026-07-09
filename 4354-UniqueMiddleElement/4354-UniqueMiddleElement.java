// Last updated: 7/9/2026, 3:05:46 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid= nums[nums.length/2];
        int c=0;
        for(int n:nums){
           
            if(n==mid){
                c++;
            }
            

        }
        return c==1;
    }
}