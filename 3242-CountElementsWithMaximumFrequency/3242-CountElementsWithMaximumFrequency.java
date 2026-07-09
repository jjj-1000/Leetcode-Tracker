// Last updated: 7/9/2026, 3:06:32 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        for(int num:nums){
            freq[num]++;

        }
        int m=0;
        for (int f : freq) {
            m = Math.max(m, f);
        }

        int result = 0;
        for (int f : freq) {
            if (f == m) {
                result += f;
            }
        }

        return result;
            
        
    }
}