package Graphs.Implementation;
import java.util.ArrayList;
import java.util.List;

public class DFS {
    public List<Integer> dfsOfGraph(int V, List<Integer>[] adj) {
        List<Integer> ans = new ArrayList<>();
        int[] visited = new int[V];
        function(ans,0,adj,visited);
        return ans;
    }
    public void function(List<Integer> ans,int i,List<Integer>[] adj,int[] visited){
        visited[i] = 1;
        ans.add(i);
        for(int j : adj[i]){
            if(visited[j] != 1){
                function(ans,j,adj,visited);
            }
        }
    }
}
