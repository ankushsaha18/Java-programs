package Graphs.MST;

import java.util.*;

public class KrushkalAlgorithm {
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
        KrushkalAlgorithm k = new KrushkalAlgorithm();
        System.out.println(k.spanningTree(V, adj));
    }
    public int spanningTree(int V, List<List<List<Integer>>> adj) {
        List<int[]> edges = new ArrayList<>();
        int sum = 0;
        DisjointSet d = new DisjointSet(V);
        for(int i = 0 ; i < V ; i++){
            for(List<Integer> a : adj.get(i)){
                int v = a.get(0);
                int wt = a.get(1);
                int u = i;
                edges.add(new int[]{wt,u,v});
            }
        }
        edges.sort(Comparator.comparingInt(o -> o[0]));
        for (int[] edge : edges){
            int u = edge[1];
            int v = edge[2];
            int wt = edge[0];
            if(d.findUP(u) != d.findUP(v)){
                sum += wt;
                d.unionBySize(u,v);
            }
        }
        return sum;
    }
}
