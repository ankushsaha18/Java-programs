package SlidingWindow_2Pointer.Questions;

public class MaxPointsCards {
    public static void main(String[] args) {
        int[] arr = {9, 10, 1, 2, 3, 5};
        System.out.println(maxScore(arr,5));
    }
    public static int maxScore(int[] cardScore, int k) {
        int ans = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0 ; i < k ; i++){
            leftSum += cardScore[i];
        }
        ans = leftSum;
        int right = cardScore.length-1;
        for(int i = k-1 ; i >= 0 ; i--){
            leftSum -= cardScore[i];
            rightSum += cardScore[right--];
            ans = Math.max(ans,leftSum+rightSum);
        }
        return ans;
    }
}
