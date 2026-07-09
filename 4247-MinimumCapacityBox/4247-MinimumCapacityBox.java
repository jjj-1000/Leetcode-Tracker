// Last updated: 7/9/2026, 3:05:52 PM
class Solution {
    public int minimumIndex(int[] c, int it) {
        int m=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<c.length;i++){
            if(c[i]>=it && c[i]<m){
                m=c[i];
                index=i;
            }
        
    
            
        }
       return index; 
    }
}