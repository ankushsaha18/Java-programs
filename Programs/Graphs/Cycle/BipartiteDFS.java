package Graphs.Cycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BipartiteDFS {
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
                if(!dfs(i,0,adj,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean dfs(int i,int col,List<Integer>[] adj,int[] color){
        color[i] = col;
        for(int node: adj[i]){
            if(color[node] == -1){
                if(!dfs(node,1-col,adj,color)){
                    return false;
                }
            }else if(color[node] == color[i]){
                return false;
            }
        }
        return true;
    }
}
