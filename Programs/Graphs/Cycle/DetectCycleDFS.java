package Graphs.Cycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetectCycleDFS {
    public static void main(String[] args) {
        int V = 4;
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[0].addAll(Arrays.asList(0,1));
        adj[1].addAll(Arrays.asList(0, 2));
        adj[2].addAll(Arrays.asList(2, 3));
        System.out.println(isCycle(V,adj));
    }
    public static boolean isCycle(int V, List<Integer>[] adj) {
        boolean[] visited = new boolean[V];
        boolean ans = false;
        for(int i = 0 ; i < V ; i++){
            if(!visited[i]){
                if(dfs(i,adj,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int i,List<Integer>[] adj,boolean[] visited,int prev){
        visited[i] = true;
        for(int node: adj[i]){
            if(!visited[node]){
                visited[node] = true;
                if(dfs(node,adj,visited,i)){
                    return true;
                }
            }else if(node != prev){
                return true;
            }
        }
        return false;
    }
}
