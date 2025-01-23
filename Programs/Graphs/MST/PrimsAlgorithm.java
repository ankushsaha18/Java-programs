package Graphs.MST;

import java.util.*;

public class PrimsAlgorithm {
    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> edges = Arrays.asList(
                Arrays.asList(0, 1, 1),
                Arrays.asList(1, 2, 2),
                Arrays.asList(2, 3, 3),
                Arrays.asList(0, 3, 4)
        );
        List<List<List<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (List<Integer> it : edges) {
            int u = it.get(0);
            int v = it.get(1);
            int wt = it.get(2);

            adj.get(u).add(Arrays.asList(v, wt));
            adj.get(v).add(Arrays.asList(u, wt));
        }
        System.out.println(spanningTree(V,adj));
    }
    public static int spanningTree(int V, List<List<List<Integer>>> adj) {
        int sum = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        boolean[] visited = new boolean[V];
        pq.add(new int[]{0,0}); // first node format {weight,node}
        while (!pq.isEmpty()){
            int[] a = pq.poll();
            int wt = a[0];
            int node = a[1];
            if(visited[node]) continue;
            sum += wt;
            visited[node] = true;
            for(List<Integer> lst : adj.get(node)){
                int adj_node = lst.get(0);  // adj list given in format {node,weight}
                int adj_wt = lst.get(1);
                if(!visited[adj_node]){
                    pq.add(new int[]{adj_wt,adj_node});
                }
            }
        }
        return sum;
    }
}
