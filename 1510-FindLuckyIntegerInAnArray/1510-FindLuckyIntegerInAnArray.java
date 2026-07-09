// Last updated: 7/9/2026, 3:08:18 PM
class Solution {
    public int findLucky(int[] arr) {
      int[] frq= new int[501];
      for(int a:arr){
        frq[a]++;
      } 
      int ans = -1;

        // Check lucky numbers
        for (int i = 1; i < frq.length; i++) {

            if (frq[i] == i) {
                ans = Math.max(ans, i);
            }
        }
      return ans;
    }
}