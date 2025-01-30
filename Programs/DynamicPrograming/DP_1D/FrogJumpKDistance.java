package DynamicPrograming.DP_1D;

import java.util.Arrays;

public class FrogJumpKDistance {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 0, 15};
        int k = 2;
        System.out.println(frogJump(arr,k));
    }
    public static int frogJump(int[] heights, int k) { //space optimization
        int n = heights.length;
        int[] dp = new int[k];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for (int i = 1 ; i < n ; i++){
            int minSteps = Integer.MAX_VALUE;
            for(int j = 1 ; j <= k ; j++){
                if(i - j >= 0){
                    int jumps = dp[(i-j)%k] + Math.abs(heights[i] - heights[i-j]);
                    minSteps = Math.min(jumps,minSteps);
                }
            }
            dp[i%k] = minSteps;
        }
        return dp[(n-1)%k];
    }
}
