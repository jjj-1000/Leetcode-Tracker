// Last updated: 9/11/2026, 6:46:31 PM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n= matrix.length;
4        int low = matrix[0][0];
5        int high = matrix[n-1][n-1];
6        
7        while(low < high){
8            int mid = low + (high - low)/2;
9            int count = lessEqual(matrix,mid);
10            if(count < k){
11                low = mid+1;
12            }
13            else{
14                high = mid;
15            }
16        }
17        return low;
18        
19    }
20    
21    //from left bottom or right top we can count how many numbers are equal or less than our target
22    
23    public int lessEqual(int[][] matrix, int target){
24        int count = 0 , len = matrix.length, i = len-1, j=0;
25        
26        while(i >=0 && j<len){
27            if(matrix[i][j] > target){
28                i--;
29            }
30            else
31            {
32                count = count + i +1;
33                j++;
34            }
35        }
36        return count;
37    }
38}