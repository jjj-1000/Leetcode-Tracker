// Last updated: 7/9/2026, 3:07:10 PM
class Solution {
    public int averageValue(int[] nums) {
        int s=0;
        int c=0;
        for(int num:nums){
            if(num%2==0 && num%3==0){
                s+=num;
                c++;
            }
        }
        if(c==0) return 0;

        
        return s/c;        
      
    }
}