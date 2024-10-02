package Heap_PriorityQueue.Questions;

public class CheckMinHeap {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 21, 23};
        System.out.println(isHeap(nums));
    }
    public static boolean isHeap(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int l = 2*i+1; // 0 indexed
            int r = 2*i+2;
            if(l < n && nums[l] < nums[i]){
                return false;
            }
            if(r < n && nums[r] < nums[i]){
                return false;
            }
        }
        return true;
    }
}
