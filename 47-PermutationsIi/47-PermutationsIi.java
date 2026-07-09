// Last updated: 7/9/2026, 3:14:08 PM
class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        permutations(0,nums);
        return ans;
        
    }
    void permutations(int i, int nums[]){
        if(i==nums.length-1){
            List<Integer> temp = new ArrayList<>();
            for(int k=0;k<nums.length;k++){
                temp.add(nums[k]);
            }
            ans.add(temp);
        }
        HashSet<Integer> set= new HashSet<>();
        for(int j=i;j<nums.length;j++){
             if(set.contains(nums[j])){
                continue;
                
             }
            set.add(nums[j]);
             int t = nums[j];
             nums[j]= nums[i];
             nums[i] = t;
             permutations(i+1,nums);
             t = nums[j];
             nums[j]= nums[i];
             nums[i] = t;
        }
    
    }
}