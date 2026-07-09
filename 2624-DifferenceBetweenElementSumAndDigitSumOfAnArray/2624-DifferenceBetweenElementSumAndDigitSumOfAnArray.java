// Last updated: 7/9/2026, 3:07:00 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int num:nums){
            sum1+=num;
            int t=num;
            while(t>0){
                sum2+=t%10;
                t/=10;
            }
        }
        return Math.abs(sum1-sum2);
    }
}