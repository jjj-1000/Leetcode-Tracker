// Last updated: 7/9/2026, 3:06:52 PM
class Solution {
    public int kItemsWithMaximumSum(int no, int nz, int nn, int k) {
       if(k<=no){
        return k;

       }else if(k<=(no+nz)){
        return no;
       }else{
        int r=k-(no+nz);
        return no-r;
       }
    }
}