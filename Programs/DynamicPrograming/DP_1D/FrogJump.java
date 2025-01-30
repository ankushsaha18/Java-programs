package DynamicPrograming.DP_1D;

public class FrogJump {
    public static void main(String[] args) {
        int[] heights = {0,2,5,6,7};
        System.out.println(frogJump(heights));
    }
    public static int frogJump(int[] heights) { //space optimization
        int n = heights.length;
        int prev1 = 0;
        int prev2 = 0;
        for (int i = 1 ; i < n ; i++){
            int l = prev1 + Math.abs(heights[i] - heights[i-1]);
            int r = l;
            if(i > 1){
                r = prev2 + Math.abs(heights[i] - heights[i-2]);
            }
            prev2 = prev1;
            prev1 = Math.min(l,r);
        }
        return prev1;
    }
}
