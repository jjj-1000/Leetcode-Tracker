// Last updated: 7/9/2026, 3:06:11 PM
class Solution {
    public int maxFreqSum(String s) {
        int[] freq= new int[26];
        char[] c= s.toCharArray();
        for(char v:c){
            freq[v-'a']++;
        }
        int maxvowel=0;
        int maxconsonant=0;
        for(int i =0;i<26;i++){
            char ch=(char)(i+'a');
                     
        
        if(ch=='a'||ch=='i'||ch=='o'
           ||ch=='u'||ch=='e'){
            if(freq[i]>maxvowel){
                maxvowel=freq[i];
            }
        }else{
              if(freq[i]>maxconsonant){
                maxconsonant=freq[i];
            }

        
           }
        } 
        return maxvowel+maxconsonant;
    }
}
        