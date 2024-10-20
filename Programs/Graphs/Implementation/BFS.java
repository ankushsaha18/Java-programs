package Graphs.Implementation;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<Integer> bfsOfGraph(int V, List<Integer>[] adj) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int[] visited = new int[V];
        visited[0] = 1;
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
