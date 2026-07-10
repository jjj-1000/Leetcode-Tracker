// Last updated: 7/10/2026, 10:26:32 PM
1class Solution {
2    public int countCharacters(String[] words, String chars) {
3
4        int[] count = new int[26];
5
6        // count chars frequency
7        for(char c : chars.toCharArray()){
8            count[c-'a']++;
9        }
10
11        int ans = 0;
12
13        for(String word : words){
14
15            int[] temp = new int[26];
16
17            for(char c : word.toCharArray()){
18                temp[c-'a']++;
19            }
20
21            boolean possible = true;
22
23            for(int i=0;i<26;i++){
24                if(temp[i] > count[i]){
25                    possible = false;
26                    break;
27                }
28            }
29
30            if(possible){
31                ans += word.length();
32            }
33        }
34
35        return ans;
36    }
37}