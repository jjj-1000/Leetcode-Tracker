// Last updated: 7/9/2026, 3:06:22 PM
class Solution {
    public int minElement(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int s=0;
            while(n>0){
               s+=n%10;
               n=n/10;
            }
            if(s<m){
                m=s;
            }
           
        }
        return m;
    }
}