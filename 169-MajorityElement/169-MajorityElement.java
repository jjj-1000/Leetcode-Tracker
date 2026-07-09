// Last updated: 7/9/2026, 3:12:38 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        int m=n/2;
        for(int i=0;i<n;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> en : map.entrySet()){
            if(en.getValue() > m){
              return en.getKey();
            }
        }
        return 0;
    }
}