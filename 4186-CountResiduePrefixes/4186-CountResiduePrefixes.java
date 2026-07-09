// Last updated: 7/9/2026, 3:05:57 PM
class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> set = new HashSet<>();
        int count =0;
        for(int i =0;i<s.length();i++){
            set.add(s.charAt(i));
                if(set.size()== (i+1)%3){
                    count++;
                }
        }
        return count;
        
    }
}