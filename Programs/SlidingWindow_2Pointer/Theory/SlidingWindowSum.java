package SlidingWindow_2Pointer.Theory;

public class SlidingWindowSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 4, 8, 5};
        slidingwindowsum(arr,3);
    }
    public static void slidingwindowsum(int[] arr,int k){
        int n = arr.length;
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        System.out.println("Sum of Window 1 = " + sum);
        for (int i = k ; i < n ; i++){
            sum = sum + arr[i] - arr[i-k];
            System.out.println("Sum of Window " + (i-k+2) + "= " + sum);
        }
    }
}
