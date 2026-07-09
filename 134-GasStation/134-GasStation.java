// Last updated: 7/9/2026, 3:12:57 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int m=0;
        int tc=0;
        int s=0;
        for(int i=0;i<n;i++){
            tc=tc+gas[i]-cost[i];
            m=m+gas[i]-cost[i];
            if(m<0){
               s=i+1;
               m=0;
             }

            
        }
        return tc>=0 ?s:-1;
    }
}