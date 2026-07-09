// Last updated: 7/9/2026, 3:08:09 PM
class Solution {
    public int xorOperation(int n, int start) {
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;

        }
        int rs=0;
        for(int num:nums){
            rs^=num;
        }
        return rs;
    }
}