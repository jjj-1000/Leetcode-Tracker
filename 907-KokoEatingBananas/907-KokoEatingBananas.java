// Last updated: 7/9/2026, 3:09:34 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length>h) return 0;
        int l=1;
        int r=-1;
        for(int i=0;i<piles.length;i++){
          r=Math.max(r,piles[i]);
        }
        int count=0;
        while(l<=r){
            int mid = l+(r-l)/2;
            int t=0;
            for(int i=0;i<piles.length;i++){
                t+=Math.ceil((double)(piles[i])/mid);
            }
            if(t>h){
                l=mid+1;
            }else{
                count=mid;
                r=mid-1;
            }
                      
        }
       return count;
    }
}