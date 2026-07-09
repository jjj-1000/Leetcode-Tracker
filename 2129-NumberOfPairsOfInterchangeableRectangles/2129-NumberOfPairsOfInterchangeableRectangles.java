// Last updated: 7/9/2026, 3:07:29 PM
class Solution {
    public long interchangeableRectangles(int[][] rec) {
        
        
        long p=0;
        HashMap<Double,Integer> hm=new HashMap<>();
        for(int[] n:rec){
            double r= (double) n[0]/n[1];
            p=p+hm.getOrDefault(r,0);
            hm.put(r,hm.getOrDefault(r,0)+1);
        }
        return p;
            
    }
}