package GreedyAlgorithm.Scheduling;
import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] a = {900, 940, 950, 1100, 1500, 1800};
        int[] d = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(a,d));
    }
    public static int findPlatform(int[] Arrival, int[] Departure) {
        // sort the times
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        int n = Arrival.length;
        // i pointer at arrival and j at departure
        int i = 1;
        int j = 0;
        // minimum 1 platform required that's why ans = 1
        // cnt is for counter
        int ans = 1;
        int cnt = 1;
        while (i < n && j < n){
            if(Arrival[i] <= Departure[j]){
                // if colliding times then increase counter
                cnt++;
                i++;
            }else{
                // if not colliding then decrease
                cnt--;
                j++;
            }
            // ans is maximum of ans and cnt
            ans = Math.max(ans,cnt);
        }
        return ans;
    }
}
