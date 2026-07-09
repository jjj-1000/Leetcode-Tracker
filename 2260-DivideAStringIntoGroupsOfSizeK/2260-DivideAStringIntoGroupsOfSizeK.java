// Last updated: 7/9/2026, 3:07:24 PM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> res=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i+=k){
            StringBuilder c= new StringBuilder();
            for(int j=i;j<i+k;j++){
                if(j<n){
                    c.append(s.charAt(j));
                }else{
                    c.append(fill);
                    
                }
            }
            res.add(c.toString());
            
        }
        return res.toArray(new String[0]);
    }
}