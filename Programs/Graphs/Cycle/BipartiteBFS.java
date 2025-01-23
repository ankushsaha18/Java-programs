package Graphs.Cycle;
import java.util.*;

public class BipartiteBFS {
    public static void main(String[] args) {
        int V = 4;
        List<Integer>[] adj = new List[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[0].addAll(Arrays.asList(1, 3));
        adj[1].addAll(Arrays.asList(0, 2));
        adj[2].addAll(Arrays.asList(1, 3));
        adj[3].addAll(Arrays.asList(0, 2));
        System.out.println(isBipartite(V,adj));
    }
    public static boolean isBipartite(int V, List<Integer>[] adj) {
        int[] color = new int[V];
        Arrays.fill(color,-1);
        for(int i = 0 ; i < V ; i++){
            if(color[i] == -1){
                if(!bfs(i,adj,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean bfs(int i, List<Integer>[] adj,int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        color[i] = 0;
        while (!q.isEmpty()){
            int node = q.poll();
            for(int j: adj[node]){
                if(color[j] == -1){
                    q.add(j);
                    color[j] = 1 - color[node];
                }
                else if(color[j] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}
