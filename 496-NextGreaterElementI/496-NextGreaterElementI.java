// Last updated: 7/9/2026, 3:10:21 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> map = new HashMap<>();
      Stack<Integer> s = new Stack<>();
      int[] res = new int[nums1.length];
      Arrays.fill(res,-1);
      for(int x:nums2){
        while(!s.empty() && x>s.peek())
            map.put(s.pop(),x);
        s.push(x);
        
      }
      for(int i=0;i< nums1.length;i++){
        if(map.containsKey(nums1[i])){
            res[i] = map.get(nums1[i]);
        }
      } 
      return res;
    }

}