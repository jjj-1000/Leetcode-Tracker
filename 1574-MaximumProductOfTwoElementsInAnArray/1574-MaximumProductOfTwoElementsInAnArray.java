// Last updated: 7/9/2026, 3:08:13 PM
class Solution {
    public int maxProduct(int[] nums) {
        int ax=0;
      for(int i=0;i<nums.length;i++){
        
        for(int j=i+1;j<nums.length;j++){
           if((nums[i]-1) * (nums[j]-1)>ax){
            ax=(nums[i]-1) *(nums[j]-1);
           }
        }
      }  
      return ax;
    }
}