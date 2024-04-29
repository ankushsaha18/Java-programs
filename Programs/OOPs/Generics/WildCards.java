package OOPs.Generics;
import java.util.Arrays;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        ArrLst<Integer> obj = new ArrLst<>();
    }
}
class ArrLst<T extends Number>{
    private Object[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public ArrLst() {
        this.arr = new Object[DEFAULT_SIZE];
    }

    public void add(T a){
        if(isFull()){
            resize();
        }
        arr[size++] = a;
    }

    private boolean isFull(){
        return size == arr.length;
    }

    private void resize(){
        arr = new Object[arr.length * 2];
    }

    public T remove(){
        return (T)arr[--size];
    }

    public T get(int index){
        return (T)arr[index];
    }

    public void set(int index,T item){
        arr[index] = item;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public void getlst(List<Number> lst){
        // can only pass number type
        // not its child class
    }

    public void getList(List<? extends Number> lst){
        // we can pass Number and all its child class
    }
}