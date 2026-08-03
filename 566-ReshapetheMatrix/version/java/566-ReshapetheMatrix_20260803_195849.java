// Last updated: 8/3/2026, 7:58:49 PM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3      int  m=mat.length;
4       int  n=mat[0].length;
5        if(m*n!= r*c){
6            return mat;
7        }
8        int[][] res= new int[r][c];
9        for(int i=0;i<m;i++){
10            for(int j=0;j<n;j++){
11                int index=i*n+j;
12                int newrow= index/c;
13                int newcol = index%c;
14                res[newrow][newcol] = mat[i][j];
15
16            }
17        }
18        return res;
19    }
20}