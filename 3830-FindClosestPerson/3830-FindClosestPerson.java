// Last updated: 7/9/2026, 3:06:17 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int d=Math.abs(x-z);
        int s=Math.abs(y-z);
        if(d<s){
            return 1;
        }if(s<d){
            return 2;
        }
        else return 0;

    }
}