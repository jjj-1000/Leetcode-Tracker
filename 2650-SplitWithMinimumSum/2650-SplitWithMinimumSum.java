// Last updated: 7/9/2026, 3:06:56 PM
class Solution {
    public int splitNum(int num) {
        char[] c= String.valueOf(num).toCharArray();
        Arrays.sort(c);
        StringBuilder num1 = new StringBuilder();
        StringBuilder  num2 = new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(i%2==0){
               num1.append(c[i]);
            }else{
                num2.append(c[i]);
            }
        }
        int n=Integer.parseInt(num1.toString());
        int m=Integer.parseInt(num2.toString());
        return n+m;
    }
}