// Last updated: 7/9/2026, 3:15:00 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
     int n= s.length();
     int ans=0;
     for(int i=0;i<n;i++){
        int freq[]= new int[256];
        for(int j=i;j<n;j++){
            freq[s.charAt(j)]++;
            if(freq[s.charAt(j)]>1){
                break;
            }
            ans=Math.max(ans,j-i+1);
        }
     }
     return ans;
    }
}