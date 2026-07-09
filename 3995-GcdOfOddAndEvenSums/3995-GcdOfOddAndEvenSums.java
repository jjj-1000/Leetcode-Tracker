// Last updated: 7/9/2026, 3:06:08 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so=n*n;
        int sd=n*(n+1);
        
        
        int gcd=1;
        int min=Math.min(so,sd);
        for(int i=1;i<=min;i++){
            if(sd%i==0 && so%i==0){
                gcd=i;

            }
        }
        return gcd;
    }
}