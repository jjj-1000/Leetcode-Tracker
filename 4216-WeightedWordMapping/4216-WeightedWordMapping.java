// Last updated: 7/9/2026, 3:05:54 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder r = new StringBuilder();
        for(String word : words){
            int add=0;
        
        for(char c:word.toCharArray()){
        int i= c-'a';
        add=add+weights[i];
        }
        int remainder =add%26;
        char m=(char)('z'-remainder);
        r.append(m);
        }
        return r.toString();
    }
}