package Hashing.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basic {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",40);
        hm.put("USA",20);
        hm.put("China",41);
        System.out.println(hm);

        // Iteration
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e.getKey() + "-->" + e.getValue());
        }

        // Iterating through keys
        Set<String> s = hm.keySet();
        for(String key : s){
            System.out.println(hm.get(key));
        }
    }
}
