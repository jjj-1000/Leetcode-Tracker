// Last updated: 7/9/2026, 3:05:59 PM
class Solution {
    public String largestEven(String s) {
    int li = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='2'){
                li=i;
            }
        }
        if(li==-1){
            return "";
            
        }
    return s.substring(0,li+1);
    }
}