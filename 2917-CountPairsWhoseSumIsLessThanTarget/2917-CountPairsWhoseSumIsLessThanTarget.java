// Last updated: 7/9/2026, 3:06:40 PM
class Solution {
    public int countPairs(List<Integer> nums, int t) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<t){
                    count++;
                }
            }
        }
        return count;
    }
}