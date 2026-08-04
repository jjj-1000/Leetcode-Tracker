// Last updated: 8/4/2026, 7:58:18 PM
1class Solution {
2
3    int m;
4    int n;
5    int old;
6
7    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
8
9        m = image.length;
10        n = image[0].length;
11
12        old = image[sr][sc];
13
14        if (old == color) {
15            return image;
16        }
17
18        dfs(image, sr, sc, color);
19
20        return image;
21    }
22
23    public void dfs(int[][] image, int r, int c, int color) {
24
25        if (r < 0 || r >= m || c < 0 || c >= n) {
26            return;
27        }
28
29        if (image[r][c] != old) {
30            return;
31        }
32
33        image[r][c] = color;
34
35        dfs(image, r - 1, c, color);
36        dfs(image, r + 1, c, color);
37        dfs(image, r, c - 1, color);
38        dfs(image, r, c + 1, color);
39    }
40}