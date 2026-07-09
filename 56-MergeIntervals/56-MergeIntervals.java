// Last updated: 7/9/2026, 3:13:53 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        // Arrays.sort(intervals);
        // for(int i=0;i<intervals.length;i++){
        //     for(int j=i+1;j<intervals.length;j++){
        //         int take=intervals[i][1];
        //         int taking = intervals[j][0];
        //         if(take>taking){
        //             int[] merge=new int [intervals[i][0],intervals[j][1]];
        //         }

        //     }
        // }
        
        Arrays.sort(intervals,(a,b)-> a[0]- b[0]);
        List<int[]> merge= new ArrayList<>();
        int[] prev= intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }else{
                merge.add(prev);
                prev=intervals[i];
            }
           
        }
         merge.add(prev);
         return  merge.toArray(new int[merge.size()][]);
    }
}