// Last updated: 9/11/2026, 6:52:10 PM
1class Solution {
2    public int numMatchingSubseq(String s, String[] words) {
3        HashMap<Character,Integer>map = new HashMap<>();
4        int i=0;
5        for(char ch : s.toCharArray()){
6            if(!map.containsKey(ch)){
7                map.put(ch,i);
8            }
9            i++;
10        }
11
12        int cnt=0;
13
14        HashMap<String, Boolean>map2 = new HashMap<>();
15
16        for(String w : words){
17            if(map2.containsKey(w)){
18                if(map2.get(w)){
19                    cnt++;
20                }
21                continue;
22            }
23            map2.put(w, false);
24            if(map.containsKey(w.charAt(0)) && poss(s.substring(map.get(w.charAt(0))), w)){
25                map2.put(w, true);
26                cnt++;
27            }
28            
29        }
30        return cnt;
31    }
32
33    public boolean poss(String a, String b){
34        int i=0;
35        int j=0;
36        while(i<a.length()){
37            if(a.charAt(i)==b.charAt(j)){
38                i++;
39                j++;
40            }
41            else{
42                i++;
43            }
44
45            if(j==b.length())return true;
46        }
47        return false;
48    }
49}