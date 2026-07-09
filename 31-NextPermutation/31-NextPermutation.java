// Last updated: 7/9/2026, 3:14:28 PM
class Solution {
    public void nextPermutation(int[] nums) {
       int i=nums.length-2;
       while(i>=0 && nums[i]>=nums[i+1] ){
        i--;
       }
       if(i>=0){
        int j=nums.length-1;
        while(nums[j]<= nums[i]){
            j--;
        }
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
       }
       reverse(nums,i+1,nums.length-1);
    }
       private void reverse(int[] nums,int left,int right){
        while(left<right){
            int t= nums[left];
            nums[left]=nums[right];
            nums[right]=t;
            left++;
            right--;
        }
       }
    }
