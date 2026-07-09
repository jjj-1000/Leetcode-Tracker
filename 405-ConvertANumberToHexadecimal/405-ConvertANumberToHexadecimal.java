// Last updated: 7/9/2026, 3:10:44 PM
class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        char[] map ="0123456789abcdef".toCharArray();
        StringBuffer sb=new StringBuffer();
        while(num!=0){
        int v=num&15;
        sb.append(map[v]);
        num>>>=4;
        }
        return sb.reverse().toString();
            
        
    }
}