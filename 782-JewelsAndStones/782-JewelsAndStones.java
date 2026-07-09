// Last updated: 7/9/2026, 3:09:37 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // int freq[] = new int[256];
        int c=0;
        for(int i=0;i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    c++;
                }
            }
        }
        return c;
        
    }
}