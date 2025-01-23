package Graphs.Cycle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopoSortDFS {
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
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[V];
        for(int i = 0 ; i < V ; i++){
            if(!visited[i]){
                dfs(i,adj,visited,st);
            }
        }
        int[] ans = new int[st.size()];
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void dfs(int node, List<Integer>[] adj, boolean[] visited, Stack<Integer> st){
        visited[node] = true;
        for(int i: adj[node]){
            if(!visited[i]){
                dfs(i,adj,visited,st);
            }
        }
        st.push(node);
    }
}
