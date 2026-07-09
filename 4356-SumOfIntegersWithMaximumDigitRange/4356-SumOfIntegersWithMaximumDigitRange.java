// Last updated: 7/9/2026, 3:05:47 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int m=-1;
        int s=0;
        for(int n:nums){
            int t=n;
            int l=0;
            int sm=9;
            while(t>0){
                int d=t%10;
                l=Math.max(l,d);
                sm=Math.min(sm,d);
                t=t/10;
                
            }
            int r=l-sm;
            if(r>m){
                m=r;
                s=n;
                
            }else if(r==m){
                s+=n;
                
            }
        }
        return s;
    }
}