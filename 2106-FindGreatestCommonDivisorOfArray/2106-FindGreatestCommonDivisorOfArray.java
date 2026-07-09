// Last updated: 7/9/2026, 3:07:32 PM
class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }

        }
        int gcd=1;
        int mins=Math.min(max,min);
        for(int i=1;i<=mins;i++){
            if(max%i==0 && min%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}