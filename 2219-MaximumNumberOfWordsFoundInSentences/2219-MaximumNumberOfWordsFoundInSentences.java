// Last updated: 7/9/2026, 3:07:27 PM
class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
    
        for(int i =0;i<s.length;i++){
            String[] words = s[i].split(" ");
            int count = words.length;

        
           if(count>max){
            max=count;
            }
        }
        return max;
    }
}