// Last updated: 7/9/2026, 3:06:19 PM
class Solution {
    public boolean hasSameDigits(String s) {
      while(s.length()>2){
        StringBuilder sc = new StringBuilder();
        
        for(int i=0;i<s.length()-1;i++){
            int sum = (s.charAt(i) - '0' + s.charAt(i + 1) - '0') % 10;

            
            sc.append(sum);
        }
        s=sc.toString();
      } 
      return s.charAt(0)==s.charAt(1); 
    }
}