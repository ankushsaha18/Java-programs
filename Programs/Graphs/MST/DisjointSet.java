package Graphs.MST;
import java.util.Arrays;

class DisjointSet {
    private int[] parent;
    private int[] rank;
    private int[] size;

    public DisjointSet(int n) {
        parent = new int[n+1];
        rank = new int[n+1];
        size = new int[n+1];
        Arrays.fill(size,1);
        for(int i = 0 ; i <= n ; i++){
            parent[i] = i;
        }
    }
    public int findUP(int node){
        if(node == parent[node]){
            return node;
        }
        return parent[node] = findUP(parent[node]);
    }

    public boolean find(int u, int v) {
        return findUP(u) == findUP(v);
    }

    public void unionByRank(int u, int v) {
        int u_ulp = findUP(u);
        int v_ulp = findUP(v);
        if(u_ulp == v_ulp){
            return;
        }
        if(rank[u_ulp] < rank[v_ulp]){
            parent[u_ulp] = v_ulp;
        }
        else if(rank[v_ulp] < rank[u_ulp]){
            parent[v_ulp] = u_ulp;
        }else{
            parent[v_ulp] = u_ulp;
            rank[u_ulp]++;
        }
    }

    public void unionBySize(int u, int v) {
        int u_ulp = findUP(u);
        int v_ulp = findUP(v);
        if(u_ulp == v_ulp){
            return;
        }
        if(size[u_ulp] < size[v_ulp]){
            parent[u_ulp] = v_ulp;
            size[v_ulp] += size[u_ulp];
        }else{
            parent[v_ulp] = u_ulp;
            size[u_ulp] += size[v_ulp];
        }
    }
}