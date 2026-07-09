// Last updated: 7/9/2026, 3:11:49 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int m=nums.length/3;
        List<Integer> l=new ArrayList<>();
        for(Map.Entry<Integer,Integer> en: map.entrySet()){
            if(en.getValue()>m){
                l.add(en.getKey());
                
            }
        }
        return l;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     int [] add= new int[nums.length];
        //     if(count>nums.length/3){
        //         add=nums[i];
        //     }
        // }
        // return add;
    }
}