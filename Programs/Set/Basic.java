package Set;
import java.util.HashSet;
import java.util.Set;

public class Basic {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(20);
        System.out.println(set.size());
    }
}
