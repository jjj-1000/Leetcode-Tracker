// Last updated: 7/9/2026, 3:14:51 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int org=x;
        int rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        if(org==rev) return true;
        else return false;
    }
}