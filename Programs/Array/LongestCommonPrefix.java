package Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    // Asked to find the longest common prefix in an array of string
    // First we will sort the array
    // Then we will find the longest common between first and last
    public static void main(String[] args) {
        String[] str = {"flowers" , "flow" , "fly", "flight" };
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] str) {
        String ans = "";
        Arrays.sort(str);
        int i = 0;
        while(str[0].charAt(i) == str[str.length-1].charAt(i)){
            ans += str[0].charAt(i);
            i++;
        }
        return ans;
    }
}
