package OOPs.Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public CustomArrayList() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int a){
        if(isFull()){
            resize();
        }
        arr[size++] = a;
    }

    private boolean isFull(){
        return size == arr.length;
    }

    private void resize(){
        arr = new int[arr.length * 2];
    }

    public int remove(){
        return arr[--size];
    }

    public int get(int index){
        return arr[index];
    }

    public void set(int index,int item){
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
