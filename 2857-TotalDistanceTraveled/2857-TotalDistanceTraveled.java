// Last updated: 7/9/2026, 3:06:43 PM
class Solution {
    public int distanceTraveled(int MT, int AT) {
        int M=0;
        while(MT>=5){
            M=M+50;
            MT=MT-5;
            if(AT>=1){
               MT++;
               AT--;
            }
              
        }
        return M+(MT*10);
       

        
    }
}