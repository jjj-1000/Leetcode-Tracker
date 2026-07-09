// Last updated: 7/9/2026, 3:08:06 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
       int s=0;
       HashMap<Integer,Integer> freq=new HashMap<>();
       for(int i=0;i<nums.length;i++){
         s+=freq.getOrDefault(nums[i],0);
         freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
       }
       
       return s;
    }
}