package OOPs.Clone;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;
    Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr =new int[]{1,2,3,4,5};
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
