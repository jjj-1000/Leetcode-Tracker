// Last updated: 8/27/2026, 3:57:18 PM
1/*
2 * // This is the custom function interface.
3 * // You should not implement it, or speculate about its implementation
4 * class CustomFunction {
5 *     // Returns f(x, y) for any given positive integers x and y.
6 *     // Note that f(x, y) is increasing with respect to both x and y.
7 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
8 *     public int f(int x, int y);
9 * };
10 */
11
12      class Solution {
13    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
14        List<List<Integer>> ans=new ArrayList<>();
15        int x=1,y=1000;
16        while(x<1000 && y>0)
17        {
18            int cal=customfunction.f(x,y);
19            if(cal>z)--y;
20            else if(cal<z) ++x;
21            else ans.add(Arrays.asList(x++, y--));
22        }
23        return ans;
24    }
25    
26}