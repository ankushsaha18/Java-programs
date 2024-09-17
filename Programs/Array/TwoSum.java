package Array;
import java.util.Arrays;
import java.util.Comparator;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, -7, 6, -3};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        // 2D array to store {element, index} pairs
        int[][] eleIndex = new int[n][2];
        for (int i = 0; i < nums.length; i++) {
            eleIndex[i][0] = nums[i];
            eleIndex[i][1] = i;
        }
        Arrays.sort(eleIndex, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        int left = 0, right = n - 1;

        while (left < right) {
            int sum = eleIndex[left][0] + eleIndex[right][0];

            if (sum == target) {
                ans[0] = eleIndex[left][1];
                ans[1] = eleIndex[right][1];
                return ans;

            } else if (sum < target) {
                left++;

            } else {
                right--;

            }
        }
        return new int[]{-1, -1};
    }
}

// This is just to optimise for leetcode but not the actual concept used

/*for(int i = 1 ; i < nums.length ; i++){
            for(int j = i ; j < nums.length ; j++){
                if(nums[j-i] + nums[j] == target){
                    return new int[]{j-i,j};
                }
            }
        }
        return new int[]{-1,-1};
 */
