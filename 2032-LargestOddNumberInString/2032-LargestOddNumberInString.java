// Last updated: 7/9/2026, 3:07:41 PM
class Solution {
    public String largestOddNumber(String num) {
       int n= num.length();
    
       for(int i=n-1;i>=0;i--){
           if(num.charAt(i)%2==1){
            return num.substring(0,i+1);
           }
       } 
       return "";
    }
}