package Graphs.Cycle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DirectedCycleBFS {
    // solve it using kahn's algorithm
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
        int index = 0;
        int[] indegree = new int[N];
        for(int i = 0 ; i < N ; i++){
            for(int it: adj[i]){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < N ; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int node = q.poll();
            index++;
            for(int it: adj[node]){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        return index < N;
    }
}
