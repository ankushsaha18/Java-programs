package Graphs.Cycle;

import java.util.ArrayList;
import java.util.List;

public class DirectedCycleDFS {
    public static void main(String[] args) {
        int V = 6;
        List<Integer>[] adj = new List[V];
        for(int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[0].add(1);
        adj[1].add(2); adj[1].add(5);
        adj[2].add(3);
        adj[3].add(4);
        adj[4].add(1);
        System.out.println(isCyclic(V,adj));
    }
    public static boolean isCyclic(int N, List<Integer>[] adj) {
        boolean[] visited = new boolean[N];
        boolean[] pathVisit = new boolean[N];
        for(int i = 0 ; i < N ; i++){
            if(!visited[i]){
                if(dfs(i,adj,visited,pathVisit)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int i,List<Integer>[] adj,boolean[] visited,boolean[] pathVisit){
        visited[i] = true;
        pathVisit[i] = true;
        for(int it: adj[i]){
            if(pathVisit[it]){
                return true;
            }
            if(!visited[it]){
                if(dfs(it,adj,visited,pathVisit)){
                    return true;
                }
            }
        }
        pathVisit[i] = false;
        return false;
    }
}
