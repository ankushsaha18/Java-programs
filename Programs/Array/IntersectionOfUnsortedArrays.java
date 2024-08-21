package Array;
import java.util.Arrays;

public class IntersectionOfUnsortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {0,1,2,5,6,7};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        boolean[] boolCount = new boolean[1001];
        int[] count = new int[1001];
        int index = 0;
        for(int i : nums1){
            boolCount[i] = true;
        }
        for(int i : nums2){
            if(boolCount[i]){
                count[index++] = i;
                boolCount[i] = false;
            }
        }
        int[] ans = new int[index];
        for(int i = 0 ; i < index ; i++){
            ans[i] = count[i];
        }
        return ans;
    }
}
