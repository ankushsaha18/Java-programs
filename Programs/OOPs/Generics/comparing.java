package OOPs.Generics;
import java.util.Arrays;
import java.util.Comparator;

public class comparing {
    public static void main(String[] args) {
        Student a = new Student("Ankush",51,99);
        Student b = new Student("Kunal",69,98);
        Student c = new Student("Rahul",50,97);
        if(a.compareTo(b) > 0){
            System.out.println(a.name + " has more marks than " + b.name);
        }
        Student[] arr = {a,b,c};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
