package Graphs.TraversalProblems;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] adj = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        System.out.println(numProvinces(adj));
    }
    public static int numProvinces(int[][] adj) {
        List<Integer>[] adjl = new ArrayList[adj.length];
        for(int i = 0 ; i < adj.length ; i++){
            adjl[i] = new ArrayList<>();
        }
        // convert matrix to list
        for(int i = 0 ; i < adj.length ; i++){
            for(int j = 0 ; j < adj.length ; j++){
                if(adj[i][j] == 1){
                    adjl[i].add(i);
                    adjl[j].add(i);
                }
            }
        }
        int cnt = 0;
        int[] visited = new int[adj.length+1];
        // visit every node and if not visited perform bfs and increase counter
        for(int i = 0 ; i < adj.length ; i++){
            if(visited[i] == 0){
                bfs(i,adjl,visited);
                cnt++;
            }
        }
        return cnt;
    }
    public static void bfs(int node, List<Integer>[] adj,int[] visited) {
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
        }
    }
}
