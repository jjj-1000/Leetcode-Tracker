// Last updated: 7/9/2026, 3:10:18 PM
class Solution {
    public boolean checkPerfectNumber(int n) {
        int original=n;
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==original ){
            return true;
        }else{
            
        return false;
        }
    }
}