// Last updated: 7/9/2026, 3:06:59 PM
class Solution {
    public int alternateDigitSum(int n) {
     int rev=0;
     while(n!=0){
        int d=n%10;
        rev=rev*10+d;
        n=n/10;
     }
     int sum=0;
     int count =0;
     while(rev>0){
        if(count%2==0){
            sum=sum+(rev%10);
        }else{
            sum=sum-(rev%10);
        }
        count++;
        rev=rev/10;
     }
     return sum;
    }
}