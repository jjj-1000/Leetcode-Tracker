// Last updated: 7/9/2026, 3:06:41 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
       int count=0;
       for(int i=0;i<hours.length;i++){
        if(hours[i]>=target){
            count++;
        }
       }
       return count;

        
    }
}