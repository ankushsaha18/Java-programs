package Graphs.Implementation;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnectedComponents {
    public int findNumberOfComponent(int E, int V, List<List<Integer>> edges) {
        int cnt = 0;
        int[] visited = new int[V];
        List<Integer>[] adj = new ArrayList[V];
        for(int i = 0 ; i < V ; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < E ; i++){
            adj[edges.get(i).get(0)].add(edges.get(i).get(1));
            adj[edges.get(i).get(1)].add(edges.get(i).get(0));
        }
        for(int i = 0 ; i < V ; i++){
            if(visited[i] != 1){
                bfs(i,adj,visited);
                cnt++;
            }
        }
        return cnt;
    }
    public List<Integer> bfs(int node, List<Integer>[] adj,int[] visited) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = 1;
        while (!q.isEmpty()){
            int f = q.poll();
            for(int i : adj[f]){
                if(visited[i] != 1){
                    q.add(i);
                    visited[i] = 1;
                }
            }
            ans.add(f);
        }
        return ans;
    }
}
