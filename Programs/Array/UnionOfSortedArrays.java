package Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {0,1,2,5,6,7};
        System.out.println(Arrays.toString(unionArray(nums1,nums2)));
    }
    public static int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }else{
                if(union.isEmpty() || union.get(union.size()-1) != nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }
        }
        while (i < nums1.length){
            if(union.isEmpty() || union.get(union.size()-1) != nums1[i]){
                union.add(nums1[i]);
            }
            i++;
        }
        while (j < nums2.length){
            if(union.isEmpty() || union.get(union.size()-1) != nums2[j]){
                union.add(nums2[j]);
            }
            j++;
        }
        int[] ans = new int[union.size()];
        for(int k = 0 ; k < ans.length ; k++){
            ans[k] = union.get(k);
        }
        return ans;
    }
}
