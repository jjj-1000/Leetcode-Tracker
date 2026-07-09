// Last updated: 7/9/2026, 3:06:30 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
       int sum=0;
       int original=x;
       while(x!=0){
        int d=x%10;
        sum=sum+d;
        x=x/10;
       } 
       if(original%sum==0){
        return sum;
       }else{
        return -1;
       }
    }
}