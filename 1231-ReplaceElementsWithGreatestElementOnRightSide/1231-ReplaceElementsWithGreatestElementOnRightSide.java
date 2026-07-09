// Last updated: 7/9/2026, 3:09:07 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int v=-1;
        
        for(int i=arr.length-1;i>=0;i--){
            int t=arr[i];
            arr[i] = v;
            if(t>v){
                v=t;
            }


        }
        return arr;
        
    }
}