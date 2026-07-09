// Last updated: 7/9/2026, 3:07:04 PM
class Solution {
    public int countDigits(int n) {
        int count =0;
        int o=n;
        while(n!=0){
            int d=n%10;
            if(o%d==0){
                count++;    
            }
            n=n/10;
        }
        return count;
 
    }
}