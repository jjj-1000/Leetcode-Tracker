// Last updated: 7/9/2026, 3:08:00 PM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int ans=0;
            int l=0;
            for(int j=i;j<n;j++){
            ans+=arr[j];
            l++;  

            
        
            if(l%2==1){
            sum+=ans;
            }
        }
        }
        return sum;
    }
}