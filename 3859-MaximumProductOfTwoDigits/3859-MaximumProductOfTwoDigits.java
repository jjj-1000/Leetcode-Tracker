// Last updated: 7/9/2026, 3:06:14 PM
class Solution {
    public int maxProduct(int n) {
        
        int m1=0;
        int m2=0;
        while(n>0){
          int d=n%10;
           if(d>m1){
             m2=m1;
             m1=d;

           
           }else if(d>m2){
              m2=d;
            }
             n=n/10;
        }
        return m1*m2;
    }
}