// Last updated: 7/9/2026, 3:07:30 PM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int sv = edges[i][0];
            int ev = edges[i][1];

            adj.get(sv).add(ev);
            adj.get(ev).add(sv);
        }

        return bfs(n, source, destination, adj);
    }

    public boolean bfs(int n, int source, int destination,
                       List<List<Integer>> adj) {

        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[n];

        q.add(source);
        visit[source] = true;

        while (!q.isEmpty()) {

            int curr = q.poll();

            if (curr == destination) {
                return true;
            }

            int m = adj.get(curr).size();

            for (int i = 0; i < m; i++) {

                int x = adj.get(curr).get(i);

                if (!visit[x]) {
                    visit[x] = true;
                    q.add(x);
                }
            }
        }

        return false;
    }
}
