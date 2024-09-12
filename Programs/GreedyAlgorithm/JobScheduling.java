package GreedyAlgorithm;
import java.util.Arrays;

public class JobScheduling {
    public static void main(String[] args) {
        int[][] jobs = { {1, 4, 20} , {2, 1, 10} , {3, 1, 40} , {4, 1, 30} };
        System.out.println(Arrays.toString(jobScheduling(jobs)));
    }
    public static int[] jobScheduling(int[][] Jobs) {
        Arrays.sort(Jobs , (a,b) -> b[2] - a[2]);  // In terms of profit in descending order
        int[] hash = new int[Jobs.length];
        // To store the Job ID
        Arrays.fill(hash,-1);
        int jobs = 0; // Total Jobs
        int profit = 0; // Total profit
        for (int[] job : Jobs) {
            // Try to do the job as last as possible
            // Iterate from the deadline day
            for (int j = job[1] - 1; j >= 0; j--) {
                if (hash[j] == -1) {
                    jobs++;
                    profit += job[2];
                    hash[j] = job[0];
                    break;
                }
            }
        }
        return new int[]{jobs,profit};
    }
}
