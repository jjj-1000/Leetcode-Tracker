// Last updated: 7/9/2026, 3:11:47 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        long  val =1;
        while(val<=n){
            if(val==n) return true;
            val=val*2;
        }
        return false;
    }   
}