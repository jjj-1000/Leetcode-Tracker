// Last updated: 7/9/2026, 3:08:29 PM
class Solution {
    public int maximum69Number (int num) {
        String s= String.valueOf(num);
        s=s.replaceFirst("6","9");
        return Integer.parseInt(s); 
    }
}