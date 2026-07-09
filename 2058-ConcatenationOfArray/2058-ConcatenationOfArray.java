// Last updated: 7/9/2026, 3:07:38 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]res= new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
              res[i] = nums[i];

        }   
        for(int j=0;j<nums.length;j++){
            res[nums.length+j] = nums[j];
        }
        return res;
     }
}