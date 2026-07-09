// Last updated: 7/9/2026, 3:06:44 PM
class Solution {
     public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int first(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    } 
    public int countBeautifulPairs(int[] nums) {
        int c=0;
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            int f=first(nums[i]);
            int l=nums[j]%10;
            if(gcd(f,l)==1){
                c++;
            }
        }
       }
       return c;
    }
}