// Last updated: 7/9/2026, 3:12:04 PM
class Solution {
    public static int sumOfSquares(int n){
        int sum=0;
        while(n!=0){
           int d=n%10;
           sum = sum+ d*d;
           n=n/10;
        }
        return sum; 
    }    
        public boolean isHappy(int n){
           int s=n;
           int f=n;
           do{
           s=sumOfSquares(s);
           f=sumOfSquares(sumOfSquares(f));

          }while(s!=f);
          return s==1?true:false;
        
    }
}