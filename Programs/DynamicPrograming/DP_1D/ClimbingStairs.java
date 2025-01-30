package DynamicPrograming.DP_1D;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {  // Space Optimization
        if(n < 2){
            return 1;
        }
        int prev1 = 1;
        int prev2 = 1;
        for (int i = 2 ; i <= n ; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static int climbStairsTabulation(int n) {
        if(n < 2){
            return 1;
        }
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2 ; i <= n ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
