// Last updated: 7/9/2026, 3:08:43 PM
class Solution {

    public int maxScoreWords(String[] words, char[] letters, int[] score) {

        int[] freq = new int[26];

        // Count available letters
        for(char ch : letters){
            freq[ch-'a']++;
        }

        return solve(words, score, freq, 0);
    }

    private int solve(String[] words, int[] score, int[] freq, int index){

        // Base Case
        if(index == words.length){
            return 0;
        }

        // Choice 1 : Skip current word
        int skip = solve(words, score, freq, index + 1);

        // Choice 2 : Take current word
        String word = words[index];

        int[] used = new int[26];

        int wordScore = 0;

        boolean possible = true;

        for(char ch : word.toCharArray()){

            int pos = ch-'a';

            used[pos]++;

            if(used[pos] > freq[pos]){
                possible = false;
            }

            wordScore += score[pos];
        }

        int take = 0;

        if(possible){

            // Use letters
            for(int i=0;i<26;i++){
                freq[i] -= used[i];
            }

            take = wordScore + solve(words, score, freq, index+1);

            // Backtrack
            for(int i=0;i<26;i++){
                freq[i] += used[i];
            }
        }

        return Math.max(skip, take);
    }
}