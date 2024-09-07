package Hashing.General;
import java.util.HashMap;
import java.util.Map;

public class HighestOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(mostFrequentElement(arr));
    }
    public static int mostFrequentElement(int[] nums) {
        int maxFreq = 0;
        int maxEl = -1;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            int freq = e.getValue();

            if(freq > maxFreq){
                maxFreq = freq;
                maxEl = e.getKey();
            }else if(freq == maxFreq){
                maxEl = Math.min(maxEl,e.getKey());
            }
        }
        return maxEl;
    }
}
