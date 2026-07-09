// Last updated: 7/9/2026, 3:09:06 PM
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int p1=0;
        int p2=1;
        int p3=1;
        int next=0;
        for(int i=2;i<n;i++){
            next=p1+p2+p3;
            p1=p2;
            p2=p3;
            p3=next;
        }
        return next;
    }
}