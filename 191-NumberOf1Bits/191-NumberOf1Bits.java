// Last updated: 7/9/2026, 3:12:14 PM
class Solution {
    public int hammingWeight(int n) {
        int i=0,res=0;
        while(n>0){
            int r=n%2;
            if(r==1) res++;
            n=n/2;


        }
        return res;
    }
}