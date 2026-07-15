// Last updated: 7/15/2026, 8:25:54 PM
1class NumMatrix {
2    private int[][] sums;
3    
4    public NumMatrix(int[][] matrix) {
5        int n = matrix.length;
6        int m = matrix[0].length;
7        sums = new int[n+1][m+1];
8        for (int i=1; i<=n; i++)
9            for (int j=1; j<=m; j++)
10                sums[i][j] = sums[i-1][j] + sums[i][j-1] + matrix[i-1][j-1] - sums[i-1][j-1];
11    }
12    
13    public int sumRegion(int row1, int col1, int row2, int col2) {
14        int RED_RECTANGLE = sums[row2+1][col2+1];
15        int PURPLE_RECTANGLES = sums[row1][col2+1] + sums[row2+1][col1];
16        int BLUE_RECTANGLE = sums[row1][col1];
17        return RED_RECTANGLE - PURPLE_RECTANGLES + BLUE_RECTANGLE;
18    }
19}