// Last updated: 7/9/2026, 3:13:11 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l= new ArrayList<>();
        
            l.add(1);
       for(int i=1;i<=rowIndex;i++){
         List<Integer> li= new ArrayList<>();
             li.add(1);
            for(int j=1;j<i;j++){
                 li.add(l.get(j-1)+l.get(j));
            }
            li.add(1);
            l=li;


                
            }
            return l;
    }
}