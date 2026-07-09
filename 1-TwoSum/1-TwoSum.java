// Last updated: 7/9/2026, 3:15:02 PM
class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer>map=new HashMap<>();

        int n=nums.length;

        
        for(int i=0;i<n;i++){
            int x= t-nums[i];
            if(map.containsKey(x)){
                return new int[]{i,map.get(x)};
            }else{
                map.put(nums[i],i);
            }
            
        }
        return new int[] {-1,-1};
    }
}