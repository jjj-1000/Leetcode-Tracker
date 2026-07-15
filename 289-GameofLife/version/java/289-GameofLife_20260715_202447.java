// Last updated: 7/15/2026, 8:24:47 PM
1class Solution {
2    public void gameOfLife(int[][] board) {
3        int n = board.length, m = board[0].length;
4        int[][] nums = new int[n][m];
5        for (int i = 0; i < n; i++)
6            nums[i] = board[i].clone();
7        int[][] dirs = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
8        for (int i = 0; i < n; i++) {
9            for (int j = 0; j < m; j++) {
10                int one = 0;
11                for (int[] d : dirs) {
12                    int nx = i + d[0], ny = j + d[1];
13                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
14                    if (board[nx][ny] == 1) one++;
15                }
16                if (board[i][j] == 1) {
17                    if (one < 2 || one > 3) nums[i][j] = 0;
18                } else {
19                    if (one == 3) nums[i][j] = 1;
20                }
21            }
22        }
23        for (int i = 0; i < n; i++)
24            board[i] = nums[i].clone();
25    }
26}