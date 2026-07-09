// Last updated: 7/9/2026, 3:06:00 PM
class Solution {
    public String reversePrefix(String s, int k) {
    char[] a= s.toCharArray();
    for(int i=0;i<k/2;i++){
        char t=a[i];
        a[i]=a[k-1-i];
        a[k-1-i]=t;
    }
        return new String(a);
    }
}