// Last updated: 7/9/2026, 3:07:44 PM
class Solution {
    public int sumBase(int n, int k) {
        if( n==k){
            return 1;
        }
        int s=0;
        while(n>0){
            s+=n%k;
            n=n/k;
        }
        
        return s;    
        
    }
}