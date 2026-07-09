// Last updated: 7/9/2026, 3:11:18 PM
class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length-1;
        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        for(int i=1;i<nums.length;i+=2){
            nums[i]=arr[n--];
        }
        for(int i=0;i<nums.length;i+=2){
            nums[i]=arr[n--];
        }

    }
}