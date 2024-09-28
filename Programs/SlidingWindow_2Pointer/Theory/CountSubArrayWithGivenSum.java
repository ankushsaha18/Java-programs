package SlidingWindow_2Pointer.Theory;

public class CountSubArrayWithGivenSum {
    // It works only if array is positive
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        System.out.println(numSubarraysWithSum(arr,2));
    }
    public static int numSubarraysWithSum(int[] A, int S){
        return atmost(A,S)-atmost(A,S-1);
    }
    public static int atmost(int[] A,int S){
        if(S < 0){
            return 0;
        }
        int ans = 0;
        int left = 0;
        for(int right = 0 ; right < A.length ; right++){
            S -= A[right];
            while (S < 0){
                S += A[left++];
            }
            ans += right-left+1;
        }
        return ans;
    }
}
