package OOPs.Generics;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            arr.add(i+1);
        }
        arr.forEach((item) -> System.out.println(item*2));
        Consumer<Integer> con = (item) -> System.out.println(item + 1);
        arr.forEach(con);
    }
}
