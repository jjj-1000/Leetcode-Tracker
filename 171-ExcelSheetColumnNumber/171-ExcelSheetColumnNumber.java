// Last updated: 7/9/2026, 3:12:36 PM
class Solution {
    public int titleToNumber(String c) {
       int r=0;
       for(int i=0;i<c.length();i++){
        char m=c.charAt(i);
        int v=m-64;
        r=r*26+v;
       }
       return r;
    }
}