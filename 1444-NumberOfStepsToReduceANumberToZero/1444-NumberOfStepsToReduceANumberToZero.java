// Last updated: 7/9/2026, 3:08:31 PM
class Solution {
    public int numberOfSteps(int n) {
        int count=0;
        
    
        while(n!=0){
           if(n%2==0){
               n= n/2;
            }else{
               n=n-1;
            }
            count++;
        }
        return count;
    }
}