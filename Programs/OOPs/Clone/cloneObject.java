package OOPs.Clone;
import java.util.Arrays;

public class cloneObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human obj = new Human("Ankush",18);
        System.out.println(obj.name);
        Human obj2 = (Human) obj.clone();
        System.out.println(obj2.name);
        System.out.println(Arrays.toString(obj.arr));
        obj2.arr[0] = 100;
        System.out.println(Arrays.toString(obj2.arr));
        System.out.println(Arrays.toString(obj.arr));
    }
}
