// Last updated: 7/9/2026, 3:06:20 PM
class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int left =0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            int right=total-left;
        
            if((left%2)==(right%2)){
                count++;
            }
        }
        return count;
    }
}