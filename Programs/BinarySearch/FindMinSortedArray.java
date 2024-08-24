package BinarySearch;
import java.util.ArrayList;

public class FindMinSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        for(int i : nums){
            arr.add(i);
        }
        System.out.println(findMin(arr));
    }
    public static int findMin(ArrayList<Integer> arr) {
        int left  = 0 , right = arr.size()-1;
        int ans = Integer.MAX_VALUE;
        while (left < right){
            int mid = left + (right - left)/2;
            // Compare with the smallest value of sorted half and eliminate that half and search in other half
            if(arr.get(left) <= arr.get(mid)){
                if(arr.get(left) < ans){
                    ans = arr.get(left);
                }
                left = mid + 1;
            }else{
                if(arr.get(mid) < ans){
                    ans = arr.get(mid);
                }
                right = mid - 1;
            }
        }
        return ans;
    }
}
