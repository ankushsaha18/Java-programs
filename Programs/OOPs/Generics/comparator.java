package OOPs.Generics;
import java.util.Arrays;
import java.util.Comparator;

public class comparator {
    public static void main(String[] args) {
        Person a = new Person("Ankush",18,50000);
        Person b = new Person("Rahul",20,65000);
        Person c = new Person("Kunal",30,100000);
        Person[] arr = {b,c,a};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.salary - o2.salary;
                // Ascending Order
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
