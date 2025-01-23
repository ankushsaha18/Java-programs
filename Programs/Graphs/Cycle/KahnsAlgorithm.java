package Graphs.Cycle;
import java.util.*;

public class KahnsAlgorithm {
    public static void main(String[] args) {
        int V = 6;
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[2].add(3);
        adj[3].add(1);
        adj[4].add(0);
        adj[4].add(1);
        adj[5].add(0);
        adj[5].add(2);
        System.out.println(Arrays.toString(topoSort(V,adj)));
    }

    public static int[] topoSort(int V, List<Integer>[] adj) {
        int[] ans = new int[V];
        int index = 0;
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj[i]) {
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int node = q.poll();
            ans[index++] = node;
            for (int it : adj[node]) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        return ans;
    }
}
