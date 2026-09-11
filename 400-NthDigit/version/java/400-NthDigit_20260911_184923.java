// Last updated: 9/11/2026, 6:49:23 PM
1class Solution {
2    public int findNthDigit(int n){
3
4        long digitlength = 1;
5        int start = 1;
6        int end = 9;
7
8        // digitlength*end = digits between the particular range
9        // 1-9 , 10-99 , 100-999
10        while(n > digitlength*end){
11            n -= digitlength*end;
12            digitlength++;
13            start*=10;
14            end*=10;
15        }
16
17        start += (n-1)/digitlength;
18        String number = String.valueOf(start); // Exact number
19
20        int index = (int) ((n - 1) % digitlength); // Exact digit 
21        return number.charAt(index) - '0';
22    
23    }
24}