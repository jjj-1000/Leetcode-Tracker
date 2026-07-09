// Last updated: 7/9/2026, 3:11:00 PM
class Solution {
    public int firstUniqChar(String s) {
        
        for(int i=0;i<s.length();i++){
            int f=0;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    f=1;
                    break;
                }
            }
        
            if(f==0){
            return i;
            }
        }
        return -1;
    }
}