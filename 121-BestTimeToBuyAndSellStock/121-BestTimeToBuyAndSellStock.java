// Last updated: 7/9/2026, 3:13:08 PM
class Solution {
    public int maxProfit(int[] p) {
       int profit=0;
       int b=p[0];
       for(int i=1;i<p.length;i++){
           if(p[i]<b){
            b=p[i];
           }else if(p[i] -b>profit){
            profit=p[i]-b;

           }
       }
       return profit;
    }
}