// Last updated: 7/9/2026, 3:07:21 PM
class Solution {
    public int minimumSum(int num) {
        char[]d=String.valueOf(num).toCharArray();
        Arrays.sort(d);
        int new1=Integer.parseInt(""+d[0]+d[2]);
        int new2=Integer.parseInt(""+d[1]+d[3]);
        return new1+new2;
    }
}