// Last updated: 7/9/2026, 3:06:50 PM
class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        if(a + d == 24){
            return 0;
        }else if(a + d <=24){
            return a + d;
        }else{
            return (a+d)%24;
        }
    }
}