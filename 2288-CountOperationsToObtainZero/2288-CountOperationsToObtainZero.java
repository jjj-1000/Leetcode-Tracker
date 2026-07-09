// Last updated: 7/9/2026, 3:07:18 PM
class Solution {
    public int countOperations(int num1, int num2) {
    
        int c=0;

        if(num1==0 && num2==0) return 0;
        while(num1!=0 && num2!=0){
          if(num1 >=num2){
            num1=num1-num2;
        
         }else{
            num2=num2-num1;
            
         
         }
        c++;
        }
       return c;
    }
}