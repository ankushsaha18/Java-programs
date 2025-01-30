package DynamicPrograming.DP_1D;

import java.util.Arrays;

public class fibonacciDP {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f_memoization(n,dp));
        System.out.println(f_tabulation(n));
        System.out.println(f_spaceOptimize(n));
    }
    public static int f_memoization(int n,int[] dp){
        if(n <= 2){     // 0th fibonacci number doesn't exist
            return n-1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = f_memoization(n-1,dp) + f_memoization(n-2,dp);
        return dp[n];
    }
    public static int f_tabulation(int n){
        int[] dp = new int[n+1];
        if (n < 3){
            return n-1;
        }
        dp[0] = -1;
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3 ; i <= n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static int f_spaceOptimize(int n){
        if (n < 3){
            return n-1;
        }
        // we only need the previous two values
        // no need for entire array
        int prev2 = 0;
        int prev1 = 1;
        for (int i = 3 ; i <= n ; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
