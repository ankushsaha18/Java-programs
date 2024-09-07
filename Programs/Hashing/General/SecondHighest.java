package Hashing.General;

import java.util.HashMap;
import java.util.Map;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(secondMostFrequentElement(arr));
    }
    public static int secondMostFrequentElement(int[] nums) {
        int maxFreq = 0;
        int maxEl = -1;
        int secondFreq = 0;
        int secondEl = -1;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            int freq = e.getValue();

            if(freq > maxFreq){
                secondFreq = maxFreq;
                secondEl = maxEl;
                maxFreq = freq;
                maxEl = e.getKey();
            }else if(freq == maxFreq){
                maxEl = Math.min(maxEl,e.getKey());
            }else if(freq > secondFreq){
                secondFreq = freq;
                secondEl = e.getKey();
            }else if(freq == secondFreq){
                secondEl = Math.min(secondEl,e.getKey());
            }
        }
        return secondEl;
    }
}
