// Last updated: 7/9/2026, 3:06:02 PM
class Solution {
    public int mirrorDistance(int n) {
        int o=n;
        int r=0;
        while(n!=0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        int a=Math.abs(o-r);
        return a;
    }
}