// Last updated: 7/9/2026, 3:10:20 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       Stack<Integer> s= new Stack<>();
       int[] res = new int[nums.length];
       Arrays.fill(res,-1);
       for(int i=0;i<2*nums.length;i++){
        int x=nums[i%nums.length];
        while(!s.empty() && nums[s.peek()]<x){
            res[s.pop()] = x;
        
        }
        if(i<nums.length){
            s.push(i);
        }
       }
       return res;
    }
}