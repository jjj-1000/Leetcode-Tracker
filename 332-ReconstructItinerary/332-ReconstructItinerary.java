// Last updated: 7/9/2026, 3:11:14 PM
import java.util.*;

class Solution {

    Map<String, PriorityQueue<String>> graph;
    LinkedList<String> result;

    public List<String> findItinerary(List<List<String>> tickets) {

        graph = new HashMap<>();
        result = new LinkedList<>();

        // Build graph
        for (List<String> ticket : tickets) {

            String from = ticket.get(0);
            String to = ticket.get(1);

            graph.putIfAbsent(from, new PriorityQueue<>());
            graph.get(from).offer(to);
        }

        // Start DFS from JFK
        dfs("JFK");

        return result;
    }

    private void dfs(String airport) {

        PriorityQueue<String> pq = graph.get(airport);

        while (pq != null && !pq.isEmpty()) {

            String next = pq.poll();
            dfs(next);
        }

        // Add airport to front
        result.addFirst(airport);
    }
}