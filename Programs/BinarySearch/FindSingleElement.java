package BinarySearch;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int n =nums.length;
        //Edge cases
        if(n==1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }
        int left = 0 , right = n - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(mid%2 == 0){
                if(nums[mid+1] != nums[mid]){ // This means we are at the left half of single element
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[mid-1] != nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return nums[left];
    }
}
