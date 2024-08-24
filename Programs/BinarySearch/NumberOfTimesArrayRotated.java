package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfTimesArrayRotated {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,5,6,0,1,2,3));
        System.out.println(findKRotation(nums));
    }
    public static int findKRotation(ArrayList<Integer> nums) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        int left = 0 , right = nums.size()-1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums.get(left) <= nums.get(mid)){
                if(nums.get(left) < min){
                    min = nums.get(left);
                    ans = left;
                }
                left = mid + 1;
            }else{
                if(nums.get(mid) < min){
                    min = nums.get(mid);
                    ans = mid;
                }
                right = mid - 1;
            }
        }
        return ans;
    }
}
