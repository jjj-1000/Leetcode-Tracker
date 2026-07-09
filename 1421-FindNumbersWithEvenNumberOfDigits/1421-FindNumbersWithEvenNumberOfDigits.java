// Last updated: 7/9/2026, 3:08:36 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            int d =0;
            while(num>0){
                num=num/10;
                d++;
            }
            if(d%2==0){
                count++;
            }
        }
     



    return count;

    }
}