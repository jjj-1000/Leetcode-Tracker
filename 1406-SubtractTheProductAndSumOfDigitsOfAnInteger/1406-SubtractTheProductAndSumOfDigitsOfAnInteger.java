// Last updated: 7/9/2026, 3:08:40 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        while(n!=0){
          int num=n%10;
            p=p*num;
            s=s+num;
            n=n/10;
        }
         return p-s;
    }
}