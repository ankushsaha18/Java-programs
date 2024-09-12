package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class NmeetingsOneRoom {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(start,end));
    }
    public static int maxMeetings(int[] start, int[] end) {
        int[][] arr = new int[start.length][2];
        for(int i = 0; i < start.length; i++) {
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1]);
            }
        });
        int cnt = 0;
        int prev = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i][0] > prev) {
                prev = arr[i][1];
                cnt++;
            }
        }
        return cnt;
    }
}
