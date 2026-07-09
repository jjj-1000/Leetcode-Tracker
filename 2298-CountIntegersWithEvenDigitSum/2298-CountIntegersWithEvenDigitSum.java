// Last updated: 7/9/2026, 3:07:15 PM
class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int s=0;
            int n=i;
            while(n>0){
             s+=n%10;
              n=n/10;
            }
            if(s%2==0 ){
                count++;

            }
        }
        
        return count;
    }
}