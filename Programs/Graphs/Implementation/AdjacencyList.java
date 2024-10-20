package Graphs.Implementation;
import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4}};
        int n = 4;
        System.out.println(listGraph(arr,n));
    }
    public static ArrayList<ArrayList<Integer>> listGraph(int[][] arr,int n){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(n+1);
        for(int i = 0 ; i <= n ; i++){
            list.add(new ArrayList<>());
        }
        for (int[] m : arr) {
            int u = m[0];
            int v = m[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        return list;
    }
}
