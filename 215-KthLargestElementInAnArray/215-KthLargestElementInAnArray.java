// Last updated: 7/9/2026, 3:11:54 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0;
        int c=0;
        for(int i=nums.length-1;i>=0;i--){
            c++;
            if(c==k){
                max=nums[i];
                break;
            
            }
           
        }
        
        
        return max;

    }
}