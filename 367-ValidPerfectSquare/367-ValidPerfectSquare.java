// Last updated: 7/9/2026, 3:11:04 PM
class Solution {
    public boolean isPerfectSquare(int num) {
    //    long i=1;
    //    long j=num-1;
        
    //     while(i<=j){
    //         long mid=(i+j)/2;
    //         if(mid*mid==num){
    //              return true;
    //         }else if(mid*mid>num){
    //              j=mid-1;
    //         }else{
    //             i=mid+1;
    //         }
    //     }
    //     if(num==1) return true;
    //     return false;
        for(long i=1;i<=num;i++){
            if(i*i==num){
                return true;
            }
        }
        if(num==1) return true;
        return false;
    }
}