// Last updated: 7/9/2026, 3:06:47 PM
class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean [] visit= new boolean[n];

        int c=0;
        for(int i=0;i<n;i++){
            if(visit[i]==false){
               if(bfs(i,visit,adj)){    
                 c++;
               }
            
            }
            
        } 
      
        return c;
    }
    public boolean bfs(int sv,boolean visit[],List<List<Integer>> adj ){
        Queue<Integer> q= new LinkedList<>();
     
        q.add(sv);
        visit[sv]= true;
        int v=0;
        int ec=0;

        while(q.size()>0){
            
            int curr= q.poll();
            v++;
            ec+=adj.get(curr).size();
            int m= adj.get(curr).size();
            for(int i=0;i<m;i++){
                int x=adj.get(curr).get(i);
                if(visit[x]==false){
                    visit[x]=true;
                    q.add(x);

                }
            }
            
                
            
        }
        ec/=2;
        return ec==(v*(v-1))/2;

    }
}