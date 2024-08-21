package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {0,1,2,5,6,7};
        System.out.println(Arrays.toString(intersectionArray(nums1,nums2)));
    }
    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersect = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                intersect.add(nums2[j]);
                i++;
                j++;
            }else{
                if(nums1[i] < nums2[j]){
                    i++;
                }else{
                    j++;
                }
            }
        }
        int[] ans = new int[intersect.size()];
        for(int k = 0 ; k < ans.length ; k++){
            ans[k] = intersect.get(k);
        }
        return ans;
    }
}
