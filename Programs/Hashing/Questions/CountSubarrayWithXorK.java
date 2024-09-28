package Hashing.Questions;

import java.util.HashMap;

public class CountSubarrayWithXorK {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9};
        System.out.println(subarraysWithXorK(nums,7));
    }
    public static int subarraysWithXorK(int[] nums, int k) {
        // To store the XOR at every index
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        // XOR of 0 is always present
        map.put(0,1);
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
            if (map.containsKey(sum ^ k)) {
                ans += map.get(sum ^ k);
            }
            // Increase the count of the sum
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
