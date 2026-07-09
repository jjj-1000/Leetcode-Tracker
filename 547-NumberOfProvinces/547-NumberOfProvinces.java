// Last updated: 7/9/2026, 3:10:14 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        boolean visit[]= new boolean[v];
        int c=0;
        for(int i=0;i<v;i++){
            if(visit[i]==false){
                c++;
                bfs(i,isConnected,v,visit);
            }
        }
        return c;
    }
    public void bfs(int sv,int[][]isConnected,int v,boolean[] visit){
        Queue<Integer> q= new LinkedList<>();
        q.add(sv);
       visit[sv]=true;
       while(q.size()>0){
        int cur=q.poll();

       for(int i=0;i<v;i++){
        
         if(isConnected[cur][i]==1 &&!visit[i]){
            visit[i] = true;
            q.add(i);
         }
       }
      }
    }
}