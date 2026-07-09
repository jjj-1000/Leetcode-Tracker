// Last updated: 7/9/2026, 3:09:03 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
         int [][] dp= new int[n1+1][n2+1];
         for(int [] row: dp){
            Arrays.fill(row,-1);
         }

        int ans=helper(text1,text2,n1,n2,dp);
        return ans;
    }
        public int helper(String ch1,String ch2, int n1, int n2,int[][]dp){
              if(dp[n1][n2]!=-1) return dp[n1][n2];
              if(n1==0 || n2==0) return 0;
              if(ch1.charAt(n1-1)==ch2.charAt(n2-1)){
                int ans=1+helper(ch1,ch2,n1-1,n2-1,dp);
                return ans;
              }
              int ans1=helper(ch1,ch2,n1-1,n2,dp);
              int ans2=helper(ch1,ch2,n1,n2-1,dp);
              dp[n1][n2]=Math.max(ans1,ans2);
              return dp[n1][n2];
              

        }
    }
    
