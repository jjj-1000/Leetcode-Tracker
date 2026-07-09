// Last updated: 7/9/2026, 3:13:25 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       List<Integer> l= new ArrayList<>();
       for(int i=0;i<m;i++){
        l.add(nums1[i]);  
       }
       for(int i=0;i<n;i++){
        l.add(nums2[i]);
       }
       Collections.sort(l);
       for(int i=0;i<l.size();i++){
        nums1[i]=l.get(i);
       }
    }
}