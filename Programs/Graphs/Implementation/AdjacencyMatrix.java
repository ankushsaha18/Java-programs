package Graphs.Implementation;
import java.util.Arrays;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4}};
        int n = 4;
        int[][] adj = matrixGraph(arr,n);
        for(int i = 0 ; i <= n ; i++){
            System.out.println(Arrays.toString(adj[i]));
        }
    }
    public static int[][] matrixGraph(int[][] arr,int n){
        int[][] adj = new int[n+1][n+1];
        for (int[] m : arr) {
            int u = m[0];
            int v = m[1];
            adj[u][v] = 1;
            adj[v][u] = 1;
        }
        return adj;
    }
}
