// Last updated: 7/9/2026, 3:06:36 PM
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
       for(int i=low;i<=high;i++){
        String s=String.valueOf(i);
        if(s.length()%2==0){
            int sep=s.length()/2;
            int s1=0;
            int s2=0;
            for (int j = 0; j < sep; j++) {
                    s1 += s.charAt(j) - '0';
                }
                for (int j = sep; j < s.length(); j++) {
                    s2 += s.charAt(j) - '0';
                }

                if (s1 ==s2) {
                    c++;
                }
        }
       } 
       return c;
    }
}