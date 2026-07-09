// Last updated: 7/9/2026, 3:12:42 PM
class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ans=Integer.MAX_VALUE;

        while(i<=j){
            int mid=(i+j)/2;
            if(nums[i]<=nums[j]){
                ans=Math.min(ans,nums[i]);
                break;
            }else if(nums[mid]<nums[i]){
                ans=Math.min(ans,nums[mid]);
                j=mid-1;
            }else{
                ans=Math.min(ans,nums[mid]);
                i=mid+1;
            }
        }
        return ans;
    }
}