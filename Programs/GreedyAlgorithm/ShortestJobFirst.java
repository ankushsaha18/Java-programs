package GreedyAlgorithm;
import java.util.Arrays;

public class ShortestJobFirst {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 7, 2};
        System.out.println(solve(arr));
    }
    public static long solve(int[] bt) {
        Arrays.sort(bt);
        long waitTime = 0;
        long totalTime = 0;
        for (int j : bt) {
            waitTime += totalTime;
            totalTime += j;
        }
        return waitTime/bt.length;
    }
}
