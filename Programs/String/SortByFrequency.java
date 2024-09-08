package String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static List<Character> frequencySort(String s) {
        Pair[] freq = new Pair[26];
        for (int i = 0 ; i < 26 ; i++){
            freq[i] = new Pair(0,(char)(i+'a'));
        }
        for(char ch : s.toCharArray()){
            freq[ch-'a'].count++;
        }
        Arrays.sort(freq,(p1,p2) ->{
            if(p1.count != p2.count){
                return p2.count-p1.count;
            }
            return p1.element- p2.element;
        });
        List<Character> ans = new ArrayList<>();
        for(int i = 0 ; i < 26 ; i++){
            if(freq[i].count != 0){
                ans.add(freq[i].element);
            }
        }
        return ans;
    }
}
class Pair{
    int count;
    char element;
    public Pair(int count,char element){
        this.count = count;
        this.element = element;
    }
}
