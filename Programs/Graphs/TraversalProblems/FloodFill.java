package Graphs.TraversalProblems;
import java.util.Arrays;

public class FloodFill {
    static int[] rowVisit = {-1,0,1,0};
    static int[] colVisit = {0,1,0,-1};
    public static void main(String[] args) {
        int[][] image = { {1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] ans = floodFill(image,sr,sc,newColor);
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            ans[i] = Arrays.copyOf(image[i],m);
        }
        int inColor = image[sr][sc];
        dfs(sr,sc,ans,image,inColor,newColor);
        return ans;
    }
    public static void dfs(int row,int col,int[][] ans,int[][] image,int inColor,int newColor){
        ans[row][col] = newColor;
        for(int i = 0 ; i < 4 ; i++){
            int nrow = row + rowVisit[i];
            int ncol = col + colVisit[i];
            if(isValid(nrow,ncol, image.length, image[0].length) && image[nrow][ncol] == inColor && ans[nrow][ncol] != newColor){
                dfs(nrow,ncol,ans,image,inColor,newColor);
            }
        }
    }
    public static boolean isValid(int i,int j,int n,int m){
        if(i < 0 || i >= n){
            return false;
        }
        else return j >= 0 && j < m;
    }
}
