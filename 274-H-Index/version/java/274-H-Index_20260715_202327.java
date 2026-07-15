// Last updated: 7/15/2026, 8:23:27 PM
1public class Solution {
2    public int hIndex(int[] citations) {
3        Arrays.sort(citations);
4        int h_index = 0;
5        for (int i = citations.length - 1; i >= 0; i--) {
6            if (citations[i] > h_index)
7                h_index++;
8            else
9                break;
10        }
11        return h_index;
12    }
13}