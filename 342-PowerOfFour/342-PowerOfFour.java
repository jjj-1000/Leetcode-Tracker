// Last updated: 7/9/2026, 3:11:12 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        if ((n&(n-1))==0 & (n&0x55555555)!=0) return true;
        else return false;
    
    }
}