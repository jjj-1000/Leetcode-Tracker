// Last updated: 7/9/2026, 3:11:37 PM
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        while(n%2==0){
            n=n/2;
            
        }
        while(n%3==0){
            n=n/3;
        }
        while(n%5==0){
            n=n/5;
        }
        if (n==1) return true;
        else return false;
    }
}