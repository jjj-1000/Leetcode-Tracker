// Last updated: 7/9/2026, 3:06:57 PM
class Solution {
    public int passThePillow(int n, int t) {
    int cycle = t/(n-1);  
    int r = t%(n-1);
    if(cycle%2==0){
        return r+1;
    }else{
        return n-r;
    }
      
    }
}