// Last updated: 7/9/2026, 3:09:43 PM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left ;i<=right;i++){
            int n=i;
            boolean name= true;
            while(n>0){
                int r=n%10;
                if(r==0 || i%r!=0){
                    name= false;
                    break;
                }
                n=n/10;

            }
            if(name){
            ans.add(i);
            }
        }
        return ans;
    }
}