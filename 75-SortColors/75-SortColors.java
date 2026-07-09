// Last updated: 7/9/2026, 3:13:33 PM
class Solution {
    public void sortColors(int[] nums) {
        int c1=0;
        int c2=0;
        int c3=0;
        int [] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
              c1++;
            }
            if(nums[i]==1){
                c2++;
            }
            if(nums[i]==2){
                c3++;
            }
        }
        int in=0;
        for(int i=0;i<c1;i++) nums[in++] =0;
        for(int i=0;i<c2;i++) nums[in++] =1;
        for(int i=0;i<c3;i++) nums[in++] =2;
        
    }
}