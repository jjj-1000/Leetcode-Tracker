// Last updated: 7/9/2026, 3:06:27 PM
class Solution {
    public String winningPlayer(int x, int y) {
       int turn=1;
       while(x>=1 && y>=4){
           x=x-1;
           y=y-4;
           turn++;

       }if(turn%2==1){
           return "Bob";
       }else{
           return "Alice";
       }
       
    }
}
        