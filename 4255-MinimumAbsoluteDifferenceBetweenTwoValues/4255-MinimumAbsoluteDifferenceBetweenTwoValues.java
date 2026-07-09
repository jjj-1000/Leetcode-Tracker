// Last updated: 7/9/2026, 3:05:51 PM
class Solution {
    public int minAbsoluteDifference(int[] nums) {
    List<Integer> o=new ArrayList<>();
    List<Integer> t=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            o.add(i);
        }else if(nums[i]==2){
            t.add(i);
        }
    }
    int diff=Integer.MAX_VALUE;
        for(int i:o){
            for(int j:t){
                diff = Math.min(diff,Math.abs(i-j));
            }
        }
    return diff == Integer.MAX_VALUE ? -1 : diff;
    }
}