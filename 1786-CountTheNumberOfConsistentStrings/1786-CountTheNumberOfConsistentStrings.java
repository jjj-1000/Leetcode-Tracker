// Last updated: 7/9/2026, 3:07:55 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character>sc=new HashSet<>();

        for(char c :allowed.toCharArray()){
            sc.add(c);
        }
        int count=0;
        for(String word:words){
            for(char c:word.toCharArray()){
                if(!sc.contains(c)){
                    count--;
                    break;
                }
            }
            count++;
        }
        return count;
    } 
}