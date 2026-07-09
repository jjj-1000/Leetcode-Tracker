// Last updated: 7/9/2026, 3:13:13 PM
class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> pascal= new ArrayList<>();
                  for(int row=0;row<numRows;row++){
                        List<Integer> r=new ArrayList<>();
                            pascal.add(r);
                            for(int col=0;col<=row;col++){
                                if(col==0 || col==row){
                                    r.add(1);
                                }else{
                                 r.add(pascal.get(row-1)
                                 .get(col-1)
                                 +pascal.get(row-1)
                                 .get(col));
                                }
                            }

                }
         
         return pascal;
    }
}