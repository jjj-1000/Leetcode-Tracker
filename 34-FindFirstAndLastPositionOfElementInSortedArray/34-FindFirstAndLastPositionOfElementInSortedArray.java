// Last updated: 7/9/2026, 3:14:24 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
          if(nums[i]==target){
            l.add(i);
          }
        }
        if(l.size()==0){
            return new int[]{-1,-1};
        }
       return new int[]{l.get(0),l.get(l.size()-1)};     
    }
}