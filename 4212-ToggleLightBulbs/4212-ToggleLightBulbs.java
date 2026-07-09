// Last updated: 7/9/2026, 3:05:56 PM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
    List<Integer> n= new ArrayList<>();
        for(int b:bulbs){
            if(n.contains(b)){
                n.remove(Integer.valueOf(b));
                
            }else{
                n.add(b);
                
            }
        }
        Collections.sort(n);
        return n;
    }
}