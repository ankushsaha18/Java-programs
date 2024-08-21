package BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,1};
        System.out.println(search(arr,1));
    }
    public static int search(int[] nums, int k) {
        int low = 0 , high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == k){
                return mid;
            }else if(nums[low] <= nums[mid]){  // To check which half is sorted left or right
                if(k >= nums[low] && k <= nums[mid]){  // To check if target lies in the range of sorted part
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(k >= nums[mid] && k <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
