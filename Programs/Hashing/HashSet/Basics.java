package Hashing.HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class Basics {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        // adding
        hs.add(1);
        hs.add(5);
        hs.add(3);
        hs.add(1);

        // print all
        System.out.println(hs);

        // search
        System.out.println(hs.contains(1));

        // remove
        hs.remove(1);
        System.out.println(hs.contains(1));

        // Iterator
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
