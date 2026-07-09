// Last updated: 7/9/2026, 3:08:33 PM
class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        String rev=new StringBuilder(s).reverse().toString();
        int m=rev.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=helper(s,rev,n,m,dp);
        return n-ans;
    }
    public int helper(String ch1, String ch2, int n,int m,int[][] dp){
        if(dp[n][m]!=-1) return dp[n][m];
        if(m==0) return 0;
        if(n==0) return 0;
        if(ch1.charAt(n-1)==ch2.charAt(m-1)){
            int ans=1+helper(ch1,ch2,n-1,m-1,dp);
            return ans;
        }
        int x=helper(ch1,ch2,n-1,m,dp);
        int y=helper(ch1,ch2,n,m-1,dp);
        dp[n][m]=Math.max(x,y);
        return dp[n][m];
    }
}