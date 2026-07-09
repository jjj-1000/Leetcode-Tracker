// Last updated: 7/9/2026, 3:07:05 PM
class Solution {
public:
    int numberOfCuts(int n) {
        if(n==0 || n==1){
          return 0;

        }else if(n%2!=0){
            return n;
        }else{
            return n / 2;
        }
         

        
    }
};