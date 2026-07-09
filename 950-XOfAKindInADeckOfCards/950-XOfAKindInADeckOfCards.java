// Last updated: 7/9/2026, 3:09:28 PM
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for(int num : deck){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int g = 0;

        
        for(int count : map.values()){
            g = gcd(g, count);
        }

        return g >= 2;
    }

    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b, a % b);
    }
}