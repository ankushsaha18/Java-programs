package Hashing.General;

import java.util.HashMap;
import java.util.Map;

public class SumOfHighestAndLowest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(sumHighestAndLowestFrequency(arr));
    }
    public static int sumHighestAndLowestFrequency(int[] nums) {
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            int freq = e.getValue();

            if(freq > maxFreq){
                maxFreq = freq;
            }
            if(freq < minFreq){
                minFreq = freq;
            }
        }
        return maxFreq + minFreq;
    }
}
