// Last updated: 7/9/2026, 3:13:37 PM
class Solution {
    public int climbStairs(int n) {
    //       return helper(n);
    // }
    // public int helper(int n){
    //         if(n<=2){
    //             return n;
    //         }
    
    // return helper(n-1)+helper(n-2);
    int [] dp = new int[n+1];
    for(int i=0;i<=n;i++){
        dp[i]=-1;
    }
       return helper(n,dp); 
    
    }
      public int helper(int n,int dp[]){
        if(n<=2){
            dp[n]=n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
    
         return dp[n];

          
    
    }
}