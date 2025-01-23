package Graphs.TraversalProblems;
import java.util.LinkedList;
import java.util.Queue;

public class NumberIsland {
    public static void main(String[] args) {
        char[][] adj = { {'1', '0', '0', '0', '1'}, {'0', '1', '0', '1', '0'}, {'0', '0', '1', '0', '0'}, {'0', '1', '0', '1', '0'}};
        System.out.println(numIslands(adj));
    }
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        boolean[][] visited = new boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    cnt++;
                    bfs(i,j,grid,visited);
                }
            }
        }
        return cnt;
    }
    public static void bfs(int a,int b, char[][] grid,boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{a,b});
        visited[a][b] = true;
        int n = grid.length;
        int m = grid[0].length;
        while (!q.isEmpty()){
            int[] cell = q.poll();
            int row = cell[0];
            int column = cell[1];
            for(int i = -1 ; i <= 1 ; i++){
                for(int j = -1 ; j <= 1 ; j++){
                    int nr = row+i;
                    int nc = column+j;
                    if(isValid(nr,nc,n,m) && !visited[nr][nc] && grid[nr][nc] == '1'){
                        visited[nr][nc] = true;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
    }
    public static boolean isValid(int i,int j,int n,int m){
        if(i < 0 || i >= n){
            return false;
        }
        if(j < 0 || j >= m){
            return false;
        }
        return true;
    }
}
