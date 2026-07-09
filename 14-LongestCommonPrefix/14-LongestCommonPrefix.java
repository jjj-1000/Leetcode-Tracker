// Last updated: 7/9/2026, 3:14:44 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String f= strs[0];
       String l= strs[strs.length -1];
       int i=0;
       while(i<f.length() && i<l.length() && f.charAt(i)==l.charAt(i)){
        i++;
       }
     return f.substring(0,i);       
       
    }
}