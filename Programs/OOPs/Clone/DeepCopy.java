package OOPs.Clone;
import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human obj = new Human("Ankush",18);
        System.out.println(Arrays.toString(obj.arr));
        Human obj2 = (Human) obj.clone(); // this is Shallow Copy

        // making deep Copy
        obj2.arr = new int[obj.arr.length];
        for(int i = 0 ; i < obj.arr.length ; i++){
            obj2.arr[i] = obj.arr[i];
        }
        obj.arr[0] = 100;
        System.out.println(Arrays.toString(obj.arr));
        System.out.println(Arrays.toString(obj2.arr));
    }
}
