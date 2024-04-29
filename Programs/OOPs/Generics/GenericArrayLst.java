package OOPs.Generics;

import java.util.Arrays;

public class GenericArrayLst<T> {
    private Object[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public GenericArrayLst() {
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
}
