// Last updated: 7/9/2026, 3:06:28 PM
class Solution {
    public int minimumOperations(int[] nums) {
       int o=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%3!=0){
            o++;
        }
       }
       return o; 
    }
}