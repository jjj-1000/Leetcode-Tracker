// Last updated: 7/9/2026, 3:12:39 PM
class Solution {
    public String convertToTitle(int c) {
     StringBuffer sb=new StringBuffer();
      while(c!=0){
      int d=--c%26;
      sb.append((char)(d+65));
      c=c/26;
      }
      return sb.reverse().toString(); 
    }
     
}